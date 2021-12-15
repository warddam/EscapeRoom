import javafx.scene.shape.Shape3D;
import org.w3c.dom.css.RGBColor;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.logging.Handler;
import javax.swing.JLabel;


public class EscapeRoom extends Frame implements ActionListener {
    Button d1, d2, d3, d4;


    EscapeRoom() {
        super("Escape Room");
        d1 = new Button("Wacky Door");
        d1.setBounds(50, 100, 80, 80);
        d1.setBackground(new java.awt.Color(218, 165, 32));
        d2 = new Button("Lazy Door");
        d2.setBounds(200, 100, 80, 80);
        d2.setBackground(new java.awt.Color(218, 165, 32));
        d3 = new Button("Lucky Door");
        d3.setBounds(50, 200, 80, 80);
        d3.setBackground(new java.awt.Color(218, 165, 32));
        d4 = new Button("Mystery Door");
        d4.setBounds(200, 200, 80, 80);
        d4.setBackground(new java.awt.Color(218, 165, 32));


        d1.addActionListener(this);
        d2.addActionListener(this);
        d3.addActionListener(this);
        d4.addActionListener(this);


        add(d1);
        add(d2);
        add(d3);
        add(d4);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setBackground(Color.black);


    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == d2) {
            JOptionPane.showMessageDialog(null, "The key does not fit." + "\n" + "You have failed miserably!!!");
        }
        if (e.getSource() == d1) {
            JOptionPane.showMessageDialog(null, "The key does not fit." + "\n" + "You seriously need to concentrate!!!");
        }
        if (e.getSource() == d4) {
            JOptionPane.showMessageDialog(null, "The key does not fit." + "\n" + "To the dungeon you go!!!");
        } else if (e.getSource() == d3) {
            JOptionPane.showMessageDialog(null, "The key fits" + "\n" + "You stuck with you gut and chose luck!!!" + "\n" + "Great Job!");
        }
    }

    public static void main(String[] args) {


        new EscapeRoom();
        escapeRoomRules();
        MyTimer timerObject = new MyTimer();
       timerObject.countdown();




    }

    public static void escapeRoomRules() {

        System.out.println("You have entered the escape room." + "\n" + "Use the key to open the correct door." + "\n" + "If you choose the wrong door you will end up in turmoil.");
    }

    public static void correctDoor() {

        boolean d3 = true;



    }

    }

