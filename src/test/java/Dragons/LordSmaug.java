package Dragons;

import com.sun.xml.internal.ws.api.Component;
import junit.framework.TestCase;
import org.junit.Test;

import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

public class LordSmaug {
@org.junit.jupiter.api.Test
    public void Kor(){
    //TimeToWatch.Fight();
    int a=0;
    int b=0;
    int c=0;
    int d=0;
    //Scanner scan=new Scanner(System.in);
    //d=scan.nextInt();

   // try{
    ComponentStream[] CompStr=new ComponentStream[4];
    CompStr[0]= new ComponentStream();
    CompStr[1]=new ComponentStream();
    CompStr[2]=new ComponentStream();
    CompStr[3]=new ComponentStream();
    JDesktopPane JDP=new JDesktopPane();
    JLabel lab=new JLabel();
    lab.setText("I am working damn");
    JDP.add(lab);
    lab.setVisible(true);
    JDP.getAllFrames();
    JDP.getDesktopManager();
    JDP.setVisible(true);

   /* CompStr[0].run();
    CompStr[1].run();
    CompStr[2].run();
    CompStr[3].run();*/

    d=Integer.valueOf(JOptionPane.showInputDialog("Длительность игры:"+"\n"+"1 - минимум"+"\n"+"3 - максимум"));//}
    //catch (NumberFormatException Ex){JOptionPane.showMessageDialog(comp,"wrong imput");}
    int lifekoef;
    if (d==1) lifekoef=2; else if (d==2) lifekoef=10; else lifekoef=25;
    for (int i=0; i<600;i++) {
      //  RedDragon D1 = new RedDragon();
        BlueDragon D1 = new BlueDragon(lifekoef);
        BlackDemon D2=new BlackDemon(lifekoef);
        D1.enemy = D2;
        D2.enemy = D1;
        //D2.minmdg=0;
        //D2.maxdmg=1;
        while (D1.hp * D2.hp > 0) {
            try {
                D1.Atack(D2);
                    D2.Atack(D1);
                    c++;
            } catch (NullPointerException A) {System.out.println(c);c=0;
                if (D1.hp > 0) a++;
                else b++;
            }
        }

    }
    System.out.print("\n"+"BlueDragon| "); System.out.print(a);System.out.print("-");System.out.print(b);System.out.print("| BlackDemon");

   //D1.

a=0;
b=0;
c=0;
 for (int i=0; i<600;i++) {
        //  RedDragon D1 = new RedDragon();
        RedDragon D1 = new RedDragon(lifekoef);
        BlueDragon D2=new BlueDragon(lifekoef);
        D1.enemy = D2;
        D2.enemy = D1;
        //D2.minmdg=0;
        //D2.maxdmg=1;
        while (D1.hp * D2.hp > 0) {
            try {
                D1.Atack(D2);
                D2.Atack(D1);
                c++;
            } catch (NullPointerException A) {//System.out.println(c);c=0;
                if (D1.hp > 0) a++;
                else b++;
            }
        }

    }
    System.out.print("\n"+" RedDragon| "); System.out.print(a);System.out.print("-");System.out.print(b);System.out.print("| BlueDragon");

    //D1.
    a=0;
    b=0;
    c=0;
    for (int i=0; i<600;i++) {
        //  RedDragon D1 = new RedDragon();
        RedDragon D1 = new RedDragon(lifekoef);
        BlackDemon D2=new BlackDemon(lifekoef);
        D1.enemy = D2;
        D2.enemy = D1;
        //D2.minmdg=0;
        //D2.maxdmg=1;
        while (D1.hp * D2.hp > 0) {
            try {
                D1.Atack(D2);
                D2.Atack(D1);
                c++;
            } catch (NullPointerException A) {//System.out.println(c);c=0;
                if (D1.hp > 0) a++;
                else b++;
            }
        }

    }
    System.out.print("\n"+" RedDragon| "); System.out.print(a);System.out.print("-");System.out.print(b);System.out.print("| BlackDemon");

    //D1.

}

}


