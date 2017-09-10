package Dragons;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;

public class TestFrame extends JFrame {
    public static Dimension labelSize = new Dimension(180, 20);
    public static Border solidBorder = BorderFactory.createLineBorder(Color.YELLOW, 1);
    public static Font font = new Font("Century Gothic", Font.PLAIN, 10);
    public static JLabel setLab(JLabel Lab) {
        Lab.setVerticalAlignment(JLabel.CENTER);
        Lab.setHorizontalAlignment(JLabel.CENTER);
        Lab.setPreferredSize(labelSize);
        Lab.setBorder(solidBorder);
        Lab.setFont(font);
        Lab.setForeground(Color.lightGray);
        return Lab;

    }
        public static void createGUI() {
JFrame frame = new JFrame("Test frame");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


Border panelBorder = BorderFactory.createLineBorder(Color.ORANGE, 1);

JPanel mainPanel = new JPanel();
mainPanel.setLayout(new BorderLayout());

JPanel alignmentPanel = new JPanel(new FlowLayout());
JPanel StatsPanel = new JPanel(new FlowLayout());
alignmentPanel.setBorder(BorderFactory.createTitledBorder(panelBorder,"stats"));
            StatsPanel.setBorder(BorderFactory.createTitledBorder(panelBorder,"Stats"));



JLabel topLabel = new JLabel("Atack "+"12");
topLabel=setLab(topLabel);
StatsPanel.add(topLabel);

font = new Font(null, Font.ITALIC, 13);

JLabel bottomLabel = new JLabel("Bottom");
bottomLabel.setVerticalAlignment(JLabel.BOTTOM);
bottomLabel.setHorizontalAlignment(JLabel.CENTER);
bottomLabel.setPreferredSize(labelSize);
bottomLabel.setBorder(solidBorder);
bottomLabel.setFont(font);
bottomLabel.setForeground(Color.RED);
bottomLabel.setSize(10,20);
StatsPanel.add(bottomLabel);
StatsPanel.setSize(10,10);
Dimension Rects=new Dimension(200,300);
StatsPanel.setMaximumSize(Rects);
StatsPanel.setLocation(10,10);
StatsPanel.setPreferredSize(Rects);
            mainPanel.add(StatsPanel);

JLabel leftLabel = new JLabel("Left");
leftLabel.setVerticalAlignment(JLabel.CENTER);
leftLabel.setHorizontalAlignment(JLabel.LEFT);
leftLabel.setPreferredSize(labelSize);
leftLabel.setBorder(solidBorder);
leftLabel.setForeground(Color.BLUE);
alignmentPanel.add(leftLabel);

font = new Font(null, Font.BOLD, 10);

JLabel rightLabel = new JLabel("Right");
rightLabel.setVerticalAlignment(JLabel.CENTER);
rightLabel.setHorizontalAlignment(JLabel.RIGHT);
rightLabel.setPreferredSize(labelSize);
rightLabel.setBorder(solidBorder);
rightLabel.setForeground(Color.GRAY);
rightLabel.setFont(font);
alignmentPanel.add(rightLabel);

font = new Font("Century Gothic", Font.BOLD, 14);

JLabel centerLabel = new JLabel("Center");
centerLabel.setVerticalAlignment(JLabel.CENTER);
centerLabel.setHorizontalAlignment(JLabel.CENTER);
centerLabel.setPreferredSize(labelSize);
centerLabel.setBorder(solidBorder);
centerLabel.setFont(font);
alignmentPanel.add(centerLabel);

mainPanel.add(alignmentPanel, BorderLayout.NORTH);
StatsPanel.add(topLabel);
            StatsPanel.add(topLabel);
            StatsPanel.add(topLabel);
            StatsPanel.add(topLabel);
            StatsPanel.add(topLabel);
            StatsPanel.add(topLabel);
            StatsPanel.add(topLabel);
            StatsPanel.add(topLabel);
            mainPanel.add(StatsPanel,BorderLayout.WEST);

JPanel textPositionPanel = new JPanel();
textPositionPanel.setBorder(
                BorderFactory.createTitledBorder("Text position"));

Icon icon = UIManager.getIcon("OptionPane.errorIcon");

JLabel textPosLeftTopLabel = new JLabel("LT");
textPosLeftTopLabel.setVerticalTextPosition(JLabel.TOP);
textPosLeftTopLabel.setHorizontalTextPosition(JLabel.LEFT);
textPosLeftTopLabel.setPreferredSize(labelSize);
textPosLeftTopLabel.setBorder(solidBorder);
textPosLeftTopLabel.setIcon(icon); 
textPositionPanel.add(textPosLeftTopLabel);

icon = UIManager.getIcon("OptionPane.informationIcon");

JLabel textPosLeftBottomLabel = new JLabel("LB");
textPosLeftBottomLabel.setVerticalTextPosition(JLabel.BOTTOM);
textPosLeftBottomLabel.setHorizontalTextPosition(JLabel.LEFT);
textPosLeftBottomLabel.setPreferredSize(labelSize);
textPosLeftBottomLabel.setBorder(solidBorder);
textPosLeftBottomLabel.setIcon(icon); 
textPositionPanel.add(textPosLeftBottomLabel);

icon = UIManager.getIcon("OptionPane.questionIcon");

JLabel textPosRightTopLabel = new JLabel("RT");
textPosRightTopLabel.setVerticalTextPosition(JLabel.TOP);
textPosRightTopLabel.setHorizontalTextPosition(JLabel.RIGHT);
textPosRightTopLabel.setPreferredSize(labelSize);
textPosRightTopLabel.setBorder(solidBorder);
textPosRightTopLabel.setIcon(icon); 
textPositionPanel.add(textPosRightTopLabel);

icon = UIManager.getIcon("OptionPane.errorIcon");

JLabel textPosRightBottomLabel = new JLabel("RB");
textPosRightBottomLabel.setVerticalTextPosition(JLabel.BOTTOM);
textPosRightBottomLabel.setHorizontalTextPosition(JLabel.RIGHT);
textPosRightBottomLabel.setPreferredSize(labelSize);
textPosRightBottomLabel.setBorder(solidBorder);
textPosRightBottomLabel.setIcon(icon); 
textPositionPanel.add(textPosRightBottomLabel);

icon = UIManager.getIcon("OptionPane.informationIcon");

JLabel textPosCenterLabel = new JLabel("Center top");
textPosCenterLabel.setVerticalTextPosition(JLabel.TOP);
textPosCenterLabel.setHorizontalTextPosition(JLabel.CENTER);
textPosCenterLabel.setPreferredSize(labelSize);
textPosCenterLabel.setBorder(solidBorder);
textPosCenterLabel.setIcon(icon); 
textPositionPanel.add(textPosCenterLabel); 

mainPanel.add(textPositionPanel, BorderLayout.CENTER);

/*JPanel htmlPanel = new JPanel();
htmlPanel.setBorder(BorderFactory.createTitledBorder("HTML"));

String text = "<html><h2>What is Google Labs?</h2>" +
"<font face=’verdana’ size = 2>" +
" Google Labs is a playground <br>" +
" where our more adventurous users can play around with <br>" +
" prototypes of some of our wild and crazy ideas and <br>" +
" offer feedback directly to the engineers who developed<br>" +
" them. Please note that Labs is the first phase in <br>" +
" a lengthy product development process and none of this <br>" +
" stuff is guaranteed to make it onto Google.com. <br>" +
" While some of our crazy ideas might grow into the <br>" +
" next Gmail or iGoogle, others might turn out to be, <br>" +
" well, just plain crazy.</html>";

font = new Font(null, Font.PLAIN, 10);

JLabel htmlLabel = new JLabel();
htmlLabel.setText(text);
htmlLabel.setFont(font);
htmlPanel.add(htmlLabel);

mainPanel.add(htmlPanel, BorderLayout.SOUTH);*/

frame.getContentPane().add(mainPanel);
frame.setPreferredSize(new Dimension(900, 900));
frame.pack();
frame.setLocationRelativeTo(null);
frame.setVisible(true);
}


        public static void main(String[] args) {
javax.swing.SwingUtilities.invokeLater(new Runnable() {
public void run() {
JFrame.setDefaultLookAndFeelDecorated(true);
createGUI();
}
});
}
}
