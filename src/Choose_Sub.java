import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Choose_Sub extends JFrame {
    public Choose_Sub() {
        JFrame frame = new JFrame("Choose Subject ");

        
        JLabel label =new JLabel("Choose Subject ");
        label.setBounds(50,50,100,30);
        frame.add(label);

        String subject[]= {"Programming","Network","Computer Organization ","E-Business","Modeling","Data Structure","Software"};
        JComboBox comboBox =new JComboBox<>(subject);
        comboBox.addItemListener(new ItemListener() {
        public void itemStateChanged(ItemEvent arg0) {
            if(arg0.getStateChange()== ItemEvent.SELECTED){
                if(!comboBox.getSelectedItem().toString().equals("Choose")){
                Main m =new Main();
                m.setVisible(true);
                frame.setVisible(false);
                }
            }
        }
    });
        comboBox.setBounds(50,90,120,30);


        frame.setSize(350,300);
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT)); 
        frame.setVisible(true);
        frame.add(comboBox);

        frame.setLocation(500,250);
    }     
    }
                
                
                

    