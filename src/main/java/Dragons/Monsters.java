package Dragons;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Random;

public class Monsters  extends Dragon{
    public String SA1;
    public String SA2;
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
        JLabel LabUA1 = new JLabel("   Special Ability: "+SA1);
        LabUA1=UsefulScripts.setLab(LabUA1);
        LabUA1.setHorizontalAlignment(SwingConstants.LEFT);
        JLabel LabUA2 = new JLabel("   Special Ability: "+SA2);
        LabUA2=UsefulScripts.setLab(LabUA2);
        LabUA2.setHorizontalAlignment(2);
        StatsPanel1.add(LabA);
        StatsPanel1.add(LabD);
        StatsPanel1.add(LabDmg);
        StatsPanel1.add(LabHP);
        StatsPanel1.add(LabUA1);
        StatsPanel1.add(LabUA2);
        mainPanel.add(StatsPanel1);
        frame.setLocation(FramePosX,FramePosY);
        frame.getContentPane().add(mainPanel);
        frame.setPreferredSize(new Dimension(200, 300));
        frame.pack();
        frame.setVisible(true);
    }

    public void Atack(Dragon enemy) {
        //CounterAtack=true;
        Random ran=new Random();
        double koef = (atack-enemy.defence)*0.05+1;
        if (koef<0.25) koef=0.25;
        if (koef>5) koef=5;
        enemy.GetDmg ((int) ((ran.nextInt(maxdmg-mindmg+1)+mindmg)*koef*GetLuck()));
        if (enemy.hp<=0) throw new NullPointerException(this.getClass().getSimpleName());
        enemy.Counteratack(this);
        if (hp<=0) throw new NullPointerException(enemy.getClass().getSimpleName());
        GetHappy();
        enemy.CounterAtack=true;
    }

    public void GetDmg(int dm) {
            hp-=dm;
    }

    public void Counteratack(Dragon enemy) {
        if (CounterAtack == true) {
            CounterAtack = false;
            Random ran = new Random();
            double koef = (atack-enemy.defence)*0.05+1;
            if (koef<0.5) koef=0.5;
            if (koef>5) koef=5;
            enemy.GetDmg ((int) ((ran.nextInt(maxdmg-mindmg+1)+mindmg)*koef*GetLuck()));
        }
    }

    public double GetLuck() {
        Random ran=new Random();
        int i = ran.nextInt(10) * luck;
        if (i>9) return 1.5; else return 1;
    }

    public void GetHappy() {
        Random ran=new Random();
        int i=ran.nextInt(10)*happy; if (i>10) this.Atack(enemy);
    }
}
