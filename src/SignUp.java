
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hp
 */
public class SignUp {
    
    public SignUp()
    {
         Connection conn;
    }
    public static void main(String[] args) {
        
       
       
        JPanel panel = new JPanel();

        JFrame frame = new JFrame();
        frame.setSize(350, 200);
        frame.setLocation(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(panel);
        panel.setLayout(null);
        JLabel label = new JLabel("email");
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
        JButton button = new JButton("sign up");
        JButton button1 = new JButton("I Have acc");
        
        button.setBounds(10, 80, 80, 25);
        button1.setBounds(100, 80, 100, 25);
        
        button.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                try {

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/my-db", "root", "root");
              String user_email = usertext.getText();
                    String user_password = passwordtext.getText();
                    PreparedStatement query = conn.prepareStatement("insert into users (user_emaill,user_password) values (?,?)");
                    query.setString(1, user_email);
                    query.setString(2, user_password);
                    query.execute();
                } catch (Exception x) {
                    System.out.println(x);
                }
                Choose_Sub c = new Choose_Sub();
                 c.setVisible(true);
                 frame.setVisible(false);
            }
        });
        
        button1.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
              person p = new person();
              frame.setVisible(false);
            }
        });
        

        panel.add(button);
        panel.add(button1);
        

        frame.setVisible(true);
    }
}
