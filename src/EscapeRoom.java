import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class EscapeRoom {


    private static JPanel panel;
    JButton createProblem, checkAnswer;
    JLabel showProblem;
    JTextField answerInput;
    JRadioButton addition, subtraction, multiplication, division;
    ButtonGroup radios = new ButtonGroup();

    public static void main(String[] args) {

        JFrame frame = new JFrame("Escape");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        addition = new  JRadioButton("Additon");
        subtraction = new JRadioButton("Subtraction");
        multiplication = new JRadioButton("multiplication");
        division = new JRadioButton("division");


        panel = new JPanel();
        JButton Escape = new JButton("Click to Smile");
        JButton calculator = new JButton("Click to Frown");

        panel.add(Escape);
        panel.add(calculator);

    frame.add(panel);
    frame.setVisible(true);


    }

}
