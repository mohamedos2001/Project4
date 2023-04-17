import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class O_quizes extends JFrame{
    public O_quizes(){
        JFrame frame = new JFrame("Quizes ");

        JButton button = new JButton("Quiz 1 ");
          button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProjectjLabel s =new ProjectjLabel();
                s.setVisible(true);
                frame.setVisible(false);
        }
    });
        button.setBounds(110,50,150,50);
        frame.add(button);

        JButton button1 = new JButton("Quiz 2 ");
        button1.setBounds(110,120,150,50);
        frame.add(button1);

        JButton button2 =new JButton("Quiz 3 ");
        button2.setBounds(110,190,150,50);
        frame.add(button2);


        JButton button3 =new JButton("Quiz 4 ");
        button3.setBounds(110,260,150,50);
        frame.add(button3);


        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.setLocation(500,250);
    }
}