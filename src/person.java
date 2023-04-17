
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
import java.sql.ResultSet;
import javax.sound.midi.MidiDevice.Info;

public class person {

    Connection conn;

    public person() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/my-db", "root", "root");
        } catch (Exception e) {
            System.out.println(e);
        }
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350, 200);
        frame.setLocation(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(panel);
        panel.setLayout(null);
        JLabel label = new JLabel("username");
        label.setBounds(10, 20, 80, 25);
        panel.add(label);
        JTextField usertext = new JTextField();
        usertext.setBounds(100, 20, 165, 25);
        panel.add(usertext);
        JLabel passwordlabel = new JLabel("password");
        passwordlabel.setBounds(10, 50, 80, 25);
        panel.add(passwordlabel);
        JPasswordField passwordtext = new JPasswordField();
        passwordtext.setBounds(100, 50, 165, 25);
        panel.add(passwordtext);
        JButton button = new JButton("login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                try {
                    String user = usertext.getText();
                    String password = passwordtext.getText();
                    Statement stm = conn.createStatement();
                    String query = ("select * from users where user_emaill='"+user+"' and user_password='" + password + "'");
                    ResultSet res = stm.executeQuery(query);
                    if (res.next()) {
                        Choose_Sub c = new Choose_Sub();
                        c.setVisible(true);
                        frame.setVisible(false);
                     c.show();
                    } else {
                        JOptionPane.showMessageDialog(null,"password or email is not correct");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(person.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        });

        panel.add(button);

        frame.setVisible(true);
    }

}
