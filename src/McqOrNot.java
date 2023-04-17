
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class McqOrNot extends JFrame {
    private JLabel typeofquestion;
    private JRadioButton text;
    private JRadioButton multichoose;
    private ButtonGroup group;


    public McqOrNot() {
        setLayout(new FlowLayout());
        setSize(350,200);
        setLocation(500,300);
        setVisible(true);
        typeofquestion=new JLabel("type of question");
       text=new JRadioButton("text");
       multichoose=new JRadioButton("multichoose");
       add(typeofquestion);
       add(text);
       add(multichoose);

       group=new ButtonGroup();
       group.add(text);
       group.add(multichoose);
      text.addItemListener(new ItemListener() {
          @Override
          public void itemStateChanged(ItemEvent e) {
              if(text.isSelected()){
                  fop s =new fop();
                s.setVisible(true);
                
                

              }

          }
      });
      multichoose.addItemListener(new ItemListener() {
          @Override
          public void itemStateChanged(ItemEvent e) {
              if(multichoose.isSelected()){
                  student x = new student();
                  x.setVisible(true);
              }
          }
      });
      
    }

}