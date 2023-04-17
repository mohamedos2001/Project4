
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class fop extends JFrame {

    Connection conn;
    private JTextField Q1, Q2, Q3, Q4, Q5, Q6;
    private JButton b;
    private JLabel L1, L2, L3, L4, L5, L6;

    public fop() {

        super("Add Question");
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/my-db", "root", "root");
        } catch (Exception e) {
            System.out.println(e);
        }
        setLayout(new GridLayout(13, 1));
        setLocation(400, 250);
        this.setSize(500, 300);
        L1 = new JLabel(" - Q1  : This is the first Question  ?");
        Q1 = new JTextField(20);
        L2 = new JLabel(" - Q2  : This is the second Question  ?");
        Q2 = new JTextField(20);
        L3 = new JLabel(" - Q3  : This is the third Question  ?");
        Q3 = new JTextField(20);
        L4 = new JLabel(" - Q4  : This is the fourth Question  ?");
        Q4 = new JTextField(20);
        L5 = new JLabel(" - Q5  : This is the fifth Question  ?");
        Q5 = new JTextField(20);
        L6 = new JLabel(" - Q6  : This is the sixth Question  ?");
        Q6 = new JTextField(20);

        add(L1);
        add(Q1);
        add(L2);
        add(Q2);
        add(L3);
        add(Q3);
        add(L4);
        add(Q4);
        add(L5);
        add(Q5);
        add(L6);
        add(Q6);

        b = new JButton("save");
        add(b);

        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String ans1 = Q1.getText();
                    String ans2 = Q2.getText();
                    String ans3 = Q3.getText();
                    String ans4 = Q4.getText();
                    String ans5 = Q5.getText();
                    String ans6 = Q6.getText();

                    PreparedStatement query = conn.prepareStatement("insert into answers (Q1,Q2,Q3,Q4,Q5,Q6) values (?,?,?,?,?,?)");

                    query.setString(1, ans1);
                    query.setString(2, ans2);
                    query.setString(3, ans3);
                    query.setString(4, ans4);
                    query.setString(5, ans5);
                    query.setString(6, ans6);
                    query.execute();

                } catch (Exception x) {
                    System.out.println(x);
                }

                JOptionPane.showMessageDialog(null, Q1.getText() + "\n" + Q2.getText() + "\n" + Q3.getText() + "\n"
                        + Q4.getText() + "\n" + Q5.getText() + "\n" + Q6.getText());

            }

        });

    }
}
