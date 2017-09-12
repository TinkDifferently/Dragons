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
                int b=0;
                int d=1;
                int page=1;
                String setStr;
                //d = Integer.valueOf(JOptionPane.showInputDialog("Длительность игры:" + "\n" + "1 - минимум" + "\n" + "3 - максимум"));//}
                UsefulScripts.LK=DoubleWindow.CreateNumber("Модификатор здоровья:" + "\n\n"+"0-5 - impossible" +
                        "\n"+"5-10 - Very hard"+"\n"+"10-15 - Medium"+"\n"+"15+ - easy"+"\n"+"30-максимум"+"\n\n"+"hp=hp*input"+"\n"+"0-выход");
                d=UsefulScripts.LK;//выход при нуле
        if (UsefulScripts.LK>30)UsefulScripts.LK=30;
                Angel D1 = new Angel(UsefulScripts.LK);
                D1.setLoc(420,100);
                RedDragon D2=new RedDragon(UsefulScripts.LK);
                D2.setLoc(820,100);
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
                    Random ran=new Random();
                    ran.nextInt(9);
                    switch (d) {
                        case 1:D1.GetEmpoweredAttack(ran.nextInt(7)+1); //вечное усиление атаки
                            D1.Atack(D2);
                            D2.Atack(D1);
                            D1.CD();
                            break;
                        case 2:D1.GetEmpoweredDefence(ran.nextInt(5)+1); //вечное усиление защиты
                            D1.Atack(D2);
                            D2.Atack(D1);
                            D1.CD();
                            break;
                        case 3:D1.GetMoreLuck(10); //100% удача
                            D1.Atack(D2);
                            D2.Atack(D1);
                            D1.GetMoreLuck(-10);
                            D1.CD();
                            break;
                        case 4:D1.enemy.CounterAtack=false; //атака без ответа
                            D1.Atack(D2);
                            D2.Atack(D1);
                            D1.CD();
                            break;
                        case 5://Святой удар: атака игнорирует броню
                            if (D1.HolyAttackCD<1){
                            b=D2.defence; D2.defence=0; D1.Atack(D2);
                            D2.Atack(D1); D2.defence=b;
                            D1.CD();
                            D1.HolyAttackCD=3;}
                            break;
                        case 6: //святая броня: повышает броню на 5 раундов
                            if (D1.HolyArmCD<1) {
                                D1.GetEmpoweredDefence(30);
                                D1.Atack(D2);
                                D2.Atack(D1);

                                D1.CD();
                                D1.HolyArmCD = 7;
                                D1.ArmLast=3;
                            }
                            break;
                        case 7: //молитва: повышает урон на 5 раундов
                            if (D1.PrayCD<1) {
                                D1.GetEmpoweredMinDmg(30);
                                D1.Atack(D2);
                                D2.Atack(D1);
                                D1.CD();
                                D1.PrayLast=4;
                                D1.PrayCD = 6;
                            }
                            break;
                        case 8: // медитация: ангел пропускает ход, получает огромное лечение и броню на один ход
                            if (D1.MeditCD<1) {
                                D1.GetHealed((ran.nextInt(75) + 25) * UsefulScripts.LK / 2 + 75);
                                D1.defence *= 3;
                                D1.CounterAtack = false;
                                D2.Atack(D1);
                                D1.defence /= 3;
                                if (D1.hp > D1.maxhp)
                                    D1.hp = D1.maxhp;
                                D1.CD();
                                D1.MeditCD=7;
                            }
                            break;
                        case 9: if (D1.LightBoltCD<1){D1.enemy.hp-=100*UsefulScripts.LK/3; D1.LightBoltCD=25; D1.HumbleValianceCD++; D1.LightGuardianCD++; D1.GodsMercyCd++;}break;
                        case 10: if (D1.HumbleValianceCD<1) {D1.LightBoltCD++; D1.LightGuardianCD++; D1.GodsMercyCd++;D1.HumbleValianceCD=25;D1.CounterAtack=false;D1.enemy.Atack(D1);D1.enemy.Atack(D1);D1.enemy.Atack(D1); D1.GetEmpoweredHp(75+25*UsefulScripts.LK);D1.GetEmpoweredMinDmg(20);D1.GetMoreLuck(2);D1.GetMoreHappy(1);}break;
                        case 11: if (D1.LightGuardianCD<1){ D1.HumbleValianceCD++; D1.LightBoltCD++; D1.GodsMercyCd++;D1.LightGuard=true; D1.LightGuardianCD=30; D1.LightGuardianLast=7;} break;
                        case 12: if (D1.GodsMercyCd<1) { D1.ArmLast+=3;D1.LightGuardianLast+=3;D1.PrayLast+=3;D1.SignCd+=3;D1.CD();D1.CD();D1.CD(); D1.GodsMercyCd=30;}break;
                        case 13: D1.SignActivate(1); break;
                        case 14: D1.SignActivate(2); break;
                        case 15: D1.SignActivate(3); break;
                        case 16: D1.SignActivate(4); break;
                        case 101: if (page!=0) page--; break;
                        case 102: if (page!=4) page++; break;
                        default:
                            break;
                    }
                    if ((D1.hp<0)|(D2.hp<0)) break;
                    D1.FrameUpd();
                    D2.FrameUpd();
                }
                assertThat (d==0);
                }
}