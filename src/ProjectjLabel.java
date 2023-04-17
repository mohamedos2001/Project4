import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class ProjectjLabel extends JFrame {

    private JLabel jLabel;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JButton button;
    private JButton button1;

    public ProjectjLabel(){
        super("Question  ");
        setLayout(new FlowLayout());
        this.setSize(300,300);
        this.setLocation(500,200);
        jLabel = new JLabel("Quiz Name :                                                              ");
        jLabel1 = new JLabel(" - Q1  : This is the first Question  ?");
        jLabel1 = new JLabel(" ");
        jLabel2 = new JLabel("   - Q2 : This is the second Question ?");
        jLabel3 = new JLabel("  - Q3 : This is the third Question  ?");
        jLabel4 = new JLabel("    - Q4  : This is the fourth Question  ?");
        jLabel5 = new JLabel("           - Q5  : This is the fifth Question  ?                                       ");

        button = new JButton("Save");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ProjectjLabel.this,"Save Successfully","Save process",JOptionPane.INFORMATION_MESSAGE);
            }
        });

        button1 = new JButton("Cancle");

        add(jLabel);
        add(jLabel1);
        add(jLabel2);
        add(jLabel3);
        add(jLabel4);
        add(jLabel5);
        add(button);
        add(button1);


    }

}
