package Dragons;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Random;

public abstract class Guards extends Dragon {
    String SignKey="None";
    public abstract void CD();

    public abstract String GiveSetStr(int page);

    public abstract void Atack(Dragon enemy);

    public abstract void GetDmg(int dm);

    public abstract void Counteratack(Dragon enemy);

    public abstract double GetLuck();
    public abstract boolean Action( int i);

    public void GetHappy() {
        Random ran = new Random();
        int i = ran.nextInt(10) * happy;
        if (i > 10) this.Atack(enemy);
    }


    public void GetHealed(int heal){
        hp+=heal;
        if (hp>maxhp) hp=maxhp;
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
        JLabel LabSign = new JLabel(SignKey);
        LabSign=UsefulScripts.setLab(LabSign);
        StatsPanel1.add(LabA);
        StatsPanel1.add(LabD);
        StatsPanel1.add(LabDmg);
        StatsPanel1.add(LabHP);
        StatsPanel1.add(LabSign);
        mainPanel.add(StatsPanel1);
        frame.setLocation(FramePosX,FramePosY);
        frame.getContentPane().add(mainPanel);
        frame.setPreferredSize(new Dimension(200, 300));
        frame.pack();
        frame.setVisible(true);
    }
}
