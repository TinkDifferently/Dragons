package Dragons;

import javax.swing.*;

public class DoubleWindow extends JOptionPane{
    public static int CreateNumber (String s){
        int i=0;
        try {
            i = Integer.valueOf(JOptionPane.showInputDialog(s));
        }
         catch (java.lang.NumberFormatException EX){i=CreateNumber(s);}

    return i;
    }

}
