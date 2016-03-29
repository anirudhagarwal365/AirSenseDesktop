import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by anirudh on 24/12/15.
 */
public class Temp {
    AccelerometerDesktop ad;

    public static void functionality(String str, int port1, int port2, AccelerometerDesktop ad) throws Exception {
        Temp temp=new Temp();
        temp.ad=ad;
        try{
            File prev=new File("QRCode.png");
            prev.delete();
            System.out.println("Previous Version of QR code was deleted successfully");
        }
        catch (Exception e){System.out.println("No previous QR code was found");}
        String qrCodeData=str + ":" + port1 + ":" + port2;
        String filePath = "QRCode.png";
        String charset = "UTF-8";
        Map hintMap = new HashMap();
        hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
        temp.createQRCode(qrCodeData, filePath, charset, hintMap, 200, 200);
        System.out.println("QR Code image created successfully!");
        new Gui();
        //System.out.println("Data read from QR Code: " + readQRCode(filePath, charset, hintMap));
    }

    public static void createQRCode(String qrCodeData, String filePath, String charset, Map hintMap, int qrCodeheight, int qrCodewidth) throws Exception{
        BitMatrix matrix = new MultiFormatWriter().encode(new String(qrCodeData.getBytes(charset), charset), BarcodeFormat.QR_CODE, qrCodewidth, qrCodeheight, hintMap);
        MatrixToImageWriter.writeToFile(matrix, filePath.substring(filePath.lastIndexOf('.') + 1), new File(filePath));
    }
}
