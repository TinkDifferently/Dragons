package Dragons;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;

public class DStats  extends JFrame{
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

    public static void createGUI(Dragon D) {
        //JFrame frame = new JFrame(monster);
       // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Border panelBorder = BorderFactory.createLineBorder(Color.ORANGE, 1);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel StatsPanel = new JPanel(new FlowLayout());
        JPanel StatsPanel1 = new JPanel(StatsPanel.getLayout());
        //alignmentPanel.setBorder(BorderFactory.createTitledBorder(panelBorder,"stats"));
        //StatsPanel.setBorder(BorderFactory.createTitledBorder(panelBorder,"Stats"));


        String s = "Attack"+D.atack;
        int i=45;
        i-=s.length();
        String spaces="";
        for (;i>0;i--)
            spaces=spaces+" ";
        JLabel LabA = new JLabel("Attack "+spaces+D.atack);
        LabA=setLab(LabA);
        s = "Defence"+D.defence;
        i=42;
        i-=s.length();
        spaces="";
        for (;i>0;i--)
            spaces=spaces+" ";
        JLabel LabD = new JLabel("Defence "+spaces+D.defence);
        LabD=setLab(LabD);
        s = "Damage "+D.mindmg+"-"+D.maxdmg;
        i=40;
        i-=s.length();
        spaces="";
        for (;i>0;i--)
            spaces=spaces+" ";
        JLabel LabDmg = new JLabel("Damage "+spaces+D.mindmg+"-"+D.maxdmg);
        LabDmg=setLab(LabDmg);
        s = "HP "+D.hp+"/"+D.maxhp;
        i=44;
        i-=s.length();
        spaces="";
        for (;i>0;i--)
            spaces=spaces+" ";
        JLabel LabHP = new JLabel("HP "+spaces+D.hp+"/"+D.maxhp);
        LabHP=setLab(LabHP);
        StatsPanel1.add(LabA);
        StatsPanel1.add(LabD);
        StatsPanel1.add(LabDmg);
        StatsPanel1.add(LabHP);
        mainPanel.add(StatsPanel1);
        //mainPanel.add(StatsPanel1,BorderLayout.SOUTH);
        D.frame.getContentPane().add(mainPanel);
        D.frame.setPreferredSize(new Dimension(200, 300));
        D.frame.pack();
      //  frame.setLocationRelativeTo(null);
        D.frame.setVisible(true);
    }
    public static void CreateExitFrame(){
        JFrame frame=new JFrame("close");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(100, 100));
        frame.setLocation(1200,0);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
              //  createGUI("monster",0,0,0,0,0,0,0,0);
            }
        });
    }
}

