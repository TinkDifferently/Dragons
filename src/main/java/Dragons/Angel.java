package Dragons;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Random;

public class Angel extends  Dragon {
    int HolyAttackCD=0;
    int PrayCD=0;
    int HolyArmCD=0;
    int MeditCD=0;
    public Angel(int LK) {
        hp=150*LK;
        frame=new JFrame(this.getClass().getSimpleName());
        maxhp=hp;
        atack=8;
        defence=10;
        mindmg=4;
        maxdmg=11;
        luck=1;
        happy=2;
        CounterAtack=true;
    }


    public void Atack(Dragon enemy) {
        //CounterAtack=true;
        Random ran=new Random();
        double koef = (atack-enemy.defence)*0.05+1;
        if (koef<0.25) koef=0.25;
        if (koef>5) koef=5;
        enemy.hp-=(ran.nextInt(maxdmg-mindmg+1)+mindmg)*koef*GetLuck();
        if (enemy.hp<=0) throw new NullPointerException(this.getClass().getSimpleName());
        enemy.Counteratack(this);
        if (hp<=0) throw new NullPointerException(enemy.getClass().getSimpleName());
        GetHappy();
        enemy.CounterAtack=true;
    }

    public void Counteratack(Dragon enemy) {
        if (CounterAtack == true) {
            CounterAtack = false;
            Random ran = new Random();
            double koef = (atack-enemy.defence)*0.05+1;
            if (koef<0.5) koef=0.5;
            enemy.hp-=(ran.nextInt(maxdmg-mindmg+1)+mindmg)*koef*GetLuck();
        }
    }

    public double GetLuck() {
        Random ran = new Random();
        int i = ran.nextInt(10) * luck;
        if (i > 9) return 1.5;
        else return 1;
    }

    public void GetHappy() {
        Random ran = new Random();
        int i = ran.nextInt(10) * happy;
        if (i > 10) this.Atack(enemy);
    }

    public void FrameUpd() {
        frame.dispose();
        frame=new JFrame(this.getClass().getSimpleName());
        Border panelBorder = BorderFactory.createLineBorder(Color.ORANGE, 1);
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        JPanel StatsPanel = new JPanel(new FlowLayout());
        JPanel StatsPanel1 = new JPanel(StatsPanel.getLayout());
        String s = "Attack"+atack;
        int i=45;
        i-=s.length();
        String spaces="";
        for (;i>0;i--)
            spaces=spaces+" ";
        JLabel LabA = new JLabel("Attack "+spaces+atack);
        LabA=UsefulScripts.setLab(LabA);
        s = "Defence"+this.defence;
        i=42;
        i-=s.length();
        spaces="";
        for (;i>0;i--)
            spaces=spaces+" ";
        JLabel LabD = new JLabel("Defence "+spaces+defence);
        LabD=UsefulScripts.setLab(LabD);
        s = "Damage "+mindmg+"-"+maxdmg;
        i=40;
        i-=s.length();
        spaces="";
        for (;i>0;i--)
            spaces=spaces+" ";
        JLabel LabDmg = new JLabel("Damage "+spaces+mindmg+"-"+maxdmg);
        LabDmg=UsefulScripts.setLab(LabDmg);
        s = "HP "+hp+"/"+maxhp;
        i=44;
        i-=s.length();
        spaces="";
        for (;i>0;i--)
            spaces=spaces+" ";
        JLabel LabHP = new JLabel("HP "+spaces+hp+"/"+maxhp);
        LabHP=UsefulScripts.setLab(LabHP);
        StatsPanel1.add(LabA);
        StatsPanel1.add(LabD);
        StatsPanel1.add(LabDmg);
        StatsPanel1.add(LabHP);
        mainPanel.add(StatsPanel1);
        frame.setLocation(FramePosX,FramePosY);
        frame.getContentPane().add(mainPanel);
        frame.setPreferredSize(new Dimension(200, 300));
        frame.pack();
        frame.setVisible(true);
    }

    public void GetHealed(int heal){
        hp+=heal;
    }
    public void GetEmpoweredAttack(int att){
        atack+=att;
    }
    public void GetEmpoweredDefence(int def){
        defence+=def;
    }
    public void GetEmpoweredMinDmg(int md){
        mindmg+=md;
        if (maxdmg<mindmg) maxdmg=mindmg;
    }
    public void GetEmpoweredMaxDmg(int md){
        maxdmg+=md;
    }
    public void GetEmpoweredHp(int HpPlus){
        maxhp+=HpPlus;
    }
    public void GetMoreLuck(int Luck){
        luck+=Luck;
    }
    public void GetMoreHappy(int morale){
        happy+=morale;
    }

    public void CD() {
        HolyAttackCD--;
        if (--HolyArmCD==2) defence-=30;
        if (--PrayCD==1) {mindmg-=30; maxdmg-=19;}
        MeditCD--;
    }

    public String GiveSetStr(int page){
        String S;
        switch (page) {
            case 0: S="Выберите действие("+page+"/"+"4):" + "\n" + "0 - выход" + "\n" + "\n" +
                    "\n" +"\n"+"\n"+"100 - Информация"+"\n"+"102 - следующая страница"; break;
            case 1: S="Выберите действие("+page+"/"+"4):" + "\n" + "1 - увеличить атаку" + "\n" + "2 - увеличить защиту"+ "\n" + "3 - нанести гарантированный удачный удар"+
                    "\n" + "4 - нанести удар без контратаки"+"\n\n"+"100 - Информация"+"\n"+"101 - предыдущая страница"+"\n"+"102 - следующая страница"; break;
            case 2: S="Выберите действие("+page+"/"+"4):" + "\n\n"; if (HolyAttackCD>0) S+="святая атака "+"заблокировано("+HolyAttackCD+")"+"\n"; else S+="5 - святая атака"+
                    "\n"; if (HolyArmCD>0) S+="доспехи света "+"заблокировано("+HolyArmCD+")"+"\n"; else S+="6 - доспехи света"+
                    "\n"; if (PrayCD>0) S+="молитва "+"заблокировано("+PrayCD+")"+"\n"; else S+="7 - молитва"+
                    "\n"; if (MeditCD>0) S+="медитация "+"заблокировано("+MeditCD+")"; else S+="8 - медитация";
                    S+="\n\n"+"100 - Информация"+"\n"+"101 - предыдущая страница"+"\n"+"102 - следующая страница";
            break;
            case 3:S="Выберите действие("+page+"/"+"4):" + "\n\n"; if (HolyAttackCD>0) S+=" молния "+"заблокировано("+HolyAttackCD+")"+"\n"; else S+="9   -  молния"+
                    "\n"; if (HolyArmCD>0) S+="смиренная доблесть "+"заблокировано("+HolyArmCD+")"+"\n"; else S+="10 - смиреная доблесть"+
                    "\n"; if (PrayCD>0) S+="светлый страж "+"заблокировано("+PrayCD+")"+"\n"; else S+="11 - светлый страж"+
                    "\n"; if (MeditCD>0) S+="божественная милость "+"заблокировано("+MeditCD+")"; else S+="12 - божественная милость";
                S+="\n\n"+"100 - Информация"+"\n"+"101 - предыдущая страница"+"\n"+"102 - следующая страница"; break;
            case 4:S="Empty Page("+page+"/4)"+"\n"+"\n"+"100 - Информация"+"\n"+"101 - предыдущая страница"; break;
            default : S="Error: page not found"; JOptionPane.showMessageDialog(frame,S);
        }
        return S;
    }

}