import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class Main extends JFrame{
    public Main() {
        JFrame frame = new JFrame("Choose Type of Quize ");
        JButton button = new JButton("Open Quizes ");
        button.setBounds(110,50,150,50);
        button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                O_quizes s =new O_quizes();
                s.setVisible(true);
                frame.setVisible(false);
        }
    });

        JButton button1 =new JButton("Add New Quiz ");
        button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                McqOrNot s =new McqOrNot();
                s.setVisible(true);
                frame.setVisible(false);
        }
    });
        button1.setBounds(110,170,150,50);
        frame.add(button);
        frame.add(button1);

        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.setLocation(400,200);
    }
}