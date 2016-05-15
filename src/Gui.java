import com.google.zxing.qrcode.encoder.QRCode;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * Created by anirudh on 24/12/15.
 */
public class Gui extends JFrame {
    private JPanel jPanel1;
    static JLabel status;

    public Gui() throws IOException {
        super("AirSens Desktop");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jPanel1 = new JPanel();
        setContentPane(jPanel1);

        setSize(500, 250);

        //pack();
        setLayout(new BorderLayout());
        JPanel textPart = new JPanel();
        add(new JLabel(new ImageIcon("QRCode.png")),BorderLayout.EAST);
        //textPart.setBorder(new EmptyBorder(100,10,100,10));
        textPart.setLayout(new GridLayout(3,1));

        textPart.add(new JLabel("Scan the QR Code",SwingConstants.CENTER));

        JPanel jp1 = new JPanel();
        jp1.setLayout(new FlowLayout());
        jp1.add(new JLabel("IP of the Host : ", JLabel.CENTER));
        JLabel jl1=new JLabel(AccelerometerDesktop.str, JLabel.CENTER);
        jl1.setForeground(Color.blue);
        jp1.add(jl1);
        textPart.add(jp1);

        JPanel jp2 = new JPanel();
        jp2.setLayout(new FlowLayout());
        jp2.add(new JLabel("Status of the Client", JLabel.CENTER));
        status = new JLabel("Not Connected", JLabel.CENTER);
        status.setForeground(Color.RED);
        jp2.add(status);
        textPart.add(jp2);

        /*textPart.add(new JLabel("IP of the Server - " + "<html><font color = 'green'></font></html>",SwingConstants.CENTER));
        //textPart.add(new JLabel(AccelerometerDesktop.str,SwingConstants.CENTER));
        textPart.add(new JLabel("Status of Client -",SwingConstants.CENTER));
        status = new JLabel("<html><font color = 'red'>Not Connected</font></html>",SwingConstants.CENTER);
        textPart.add(status);*/
        add(textPart, BorderLayout.CENTER);
        setVisible(true);








        /*pack();


        setSize(400, 250);
        JLabel scanLabel = new JLabel("Scan this QR Code", SwingConstants.CENTER);
        JLabel statusLabel = new JLabel("hello",SwingConstants.CENTER);
        JPanel jp1 = new JPanel();
        jp1.add(scanLabel,BorderLayout.NORTH);
        jp1.add(statusLabel,BorderLayout.SOUTH);

        add(jp1, BorderLayout.CENTER);
        add(new JLabel(new ImageIcon("QRCode.png")),BorderLayout.WEST);

        //add(statusLabel, BorderLayout.WEST);
        setVisible(true);
        //setGui();*/
    }

}
