package Dragons;

import javafx.scene.control.TextInputDialog;
import sun.net.www.content.text.Generic;

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
    public static String GetStr(int page, Generic T){
        String S;
        JLabel lab=new JLabel("Error: page not found");
        switch (page) {
            case 0: S="Выберите действие("+page+"/"+"4):" + "\n" + "0 - выход" + "\n" + "\n" +
                    "\n" +"\n"+"\n"+"100 - Информация"+"\n"+"102 - следующая страница"; break;
            case 1: S="Выберите действие("+page+"/"+"4):" + "\n" + "1 - увеличить атаку" + "\n" + "2 - увеличить защиту"+ "\n" + "3 - нанести гарантированный удачный удар"+
                    "\n" + "4 - нанести удар без контратаки"+"\n"+"\n"+"100 - Информация"+"\n"+"101 - предыдущая страница"+"\n"+"102 - следующая страница"; break;
       //     case 2: S="Выберите действие("+page+"/"+"4):" + "\n"; if (D.) S+=; break;
            default : S="Error: page not found"; JOptionPane.showMessageDialog(lab,S);
        }
        return S;
    }
}
