package Dragons;

//import com.sun.imageio.stream.StreamCloser;
//import junit.framework.TestCase;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;


import javax.swing.*;
import java.util.Random;

public class TimeToWatch {
    @Test
    public void Fight(){
                JFrame.setDefaultLookAndFeelDecorated(true);
                int a=0;
                int b=0;
                int c=0;
                int d=1;
                //d = Integer.valueOf(JOptionPane.showInputDialog("Длительность игры:" + "\n" + "1 - минимум" + "\n" + "3 - максимум"));//}
                d=DoubleWindow.CreateNumber("Модификатор здоровья:" + "\n" + "hp=hp*input"+"\n"+"0-выход");
                Angel D1 = new Angel(d);
                D1.frame.setLocation(420,100);
                RedDragon D2=new RedDragon(d);
                D2.frame.setLocation(820,100);
                D1.enemy = D2;
                D2.enemy = D1;
                //DStats.CreateExitFrame();
                DStats.createGUI(D1);
                DStats.createGUI(D2);

                while (d!=0)
                {
                   // d = Integer.valueOf(JOptionPane.showInputDialog("" +
                     //       "Выберите действие:" + "\n" + "1 - увеличить атаку" + "\n" + "2 - увеличить защиту"+ "\n" + "3 - нанести гарантированный удачный удар"+
                       //     "\n" + "4 - удар без контратаки"));//}
                    d=DoubleWindow.CreateNumber("" +
                                   "Выберите действие:" + "\n" + "1 - увеличить атаку" + "\n" + "2 - увеличить защиту"+ "\n" + "3 - нанести гарантированный удачный удар"+
                                 "\n" + "4 - удар без контратаки");
                    Random ran=new Random();
                    ran.nextInt(9);
                    switch (d) {
                        case 1:D1.GetEmpoweredAttack(ran.nextInt(9)+1);
                            D1.Atack(D2);
                            D2.Atack(D1);
                            break;
                        case 2:D1.GetEmpoweredDefence(ran.nextInt(11)+1);
                            D1.Atack(D2);
                            D2.Atack(D1);
                            break;
                        case 3:D1.GetMoreLuck(10);
                            D1.Atack(D2);
                            D2.Atack(D1);
                            D1.GetMoreLuck(-10);
                            break;
                        case 4:D1.enemy.CounterAtack=false;
                            D1.Atack(D2);
                            D2.Atack(D1);
                            break;
                        default: D1.Atack(D2);
                            D2.Atack(D1);
                            break;
                    }

                    if ((D1.hp<0)|(D2.hp<0)) break;
                    D1.frame.dispose();
                    D1.FrameUpd();
                    D1.frame.setLocation(420, 150);
                    DStats.createGUI(D1);
                    D2.frame.dispose();
                    D2.FrameUpd();
                    D2.frame.setLocation(9, 150);
                    DStats.createGUI(D2);
                }
                assertThat (d==0);
                }
}