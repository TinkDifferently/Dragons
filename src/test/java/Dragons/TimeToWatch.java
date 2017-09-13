package Dragons;

//import com.sun.imageio.stream.StreamCloser;
//import junit.framework.TestCase;
import com.sun.xml.internal.bind.v2.TODO;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;


import javax.swing.*;
import java.util.Random;

public class TimeToWatch {
    @Test
    public void Fight(){
                JFrame.setDefaultLookAndFeelDecorated(true);
                int b=0;
                int d=1;
                int page=1;
                String setStr;
                //d = Integer.valueOf(JOptionPane.showInputDialog("Длительность игры:" + "\n" + "1 - минимум" + "\n" + "3 - максимум"));//}
                UsefulScripts.LK=DoubleWindow.CreateNumber("Модификатор здоровья:" + "\n\n"+"0-5 - impossible" +
                        "\n"+"5-10 - Very hard"+"\n"+"10-15 - Medium"+"\n"+"15+ - easy"+"\n"+"30-максимум"+"\n\n"+"hp=hp*input"+"\n"+"0-выход");
        // TODO: 12.09.2017  set Guard(Type+stats(optional)); set enemy; text info; 
                d=UsefulScripts.LK;//выход при нуле
        if (UsefulScripts.LK>30)UsefulScripts.LK=30;
                Guards D1 = new Angel(UsefulScripts.LK);
                D1.setLoc(420,80);
                Monsters D2=new RedDragon(UsefulScripts.LK);
                D2.setLoc(820,80);
                D1.enemy = D2;
                D2.enemy = D1;
                //DStats.CreateExitFrame();
                D1.FrameUpd();
                D2.FrameUpd();
                while (d!=0)
                {
                setStr=D1.GiveSetStr(page);
                if (setStr=="") break;
                d=DoubleWindow.CreateNumber(setStr);
                    switch (d){
                        case 0: break;
                        case 100: break;
                        case 101: if (page!=0) page--; break;
                        case 102: if (page!=4) page++; break;
                        default: if (D1.Action(d)) D1.FrameUpd();
                            D2.FrameUpd();
                    }

                    if ((D1.hp<0)|(D2.hp<0)) break;
                }
                assertThat (d==0);
                }
}