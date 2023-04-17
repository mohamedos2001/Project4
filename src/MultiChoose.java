import javax.swing.*;

public class MultiChoose extends JFrame{
    private JPanel mainpanel;
    private JRadioButton theFirstChoiseRadioButton;
    private JRadioButton theSecondChoiseRadioButton;
    private JRadioButton theThirdQuestionRadioButton;
    private JRadioButton theFirstChoiseRadioButton3;
    private JRadioButton theSecondChoiseRadioButton1;
    private JRadioButton theThirdQuestionRadioButton1;
    private JRadioButton theFirstChoiseRadioButton2;
    private JRadioButton theSecondChoiseRadioButton2;
    private JRadioButton theThirdQuestionRadioButton2;
    private JCheckBox theFirstChoiseCheckBox;
    private JCheckBox theSecondChoiseCheckBox;
    private JCheckBox theThirdQuestionCheckBox;
    private JButton submitButton;

    public MultiChoose(){
        setContentPane(mainpanel);
        setTitle("Quiz Name");
        setSize(600,600);
        setLocation(200,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        MultiChoose multiChoose =new MultiChoose();
    }
}
