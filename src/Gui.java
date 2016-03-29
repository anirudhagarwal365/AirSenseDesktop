import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 * Created by anirudh on 24/12/15.
 */
public class Gui extends JFrame {
    private JPanel jPanel1;

    public Gui() throws IOException {
        super("Accelerometer Desktop");
        jPanel1 = new JPanel();
        setContentPane(jPanel1);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(400, 250);
        add(new JLabel("Scan this QR Code", SwingConstants.CENTER), BorderLayout.NORTH);
        add(new JLabel(new ImageIcon("QRCode.png")),BorderLayout.CENTER);
        setVisible(true);
        //setGui();
    }

}
