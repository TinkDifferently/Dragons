package Dragons;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class UsefulScripts {
    public static int LK;
    public static Dimension labelSize = new Dimension(180, 20);
    public static Border solidBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
    public static Font font = new Font("Century Gothic", Font.PLAIN, 10);
    public static JLabel setLab(JLabel Lab) {
        Lab.setVerticalAlignment(JLabel.CENTER);
        Lab.setHorizontalAlignment(JLabel.CENTER);
        Lab.setPreferredSize(labelSize);
        Lab.setBorder(solidBorder);
        Lab.setFont(font);
        Lab.setForeground(Color.black);
        return Lab;

    }
}
