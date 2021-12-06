import javax.swing.*;

public class EscapeRoom {

    JPanel panel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Escape");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        panel = new EmojiPanel();
        JButton smile = new JButton("Click to Smile");
        JButton frown = new JButton("Click to Frown");

        panel.add(smile);
        panel.add(frown);


    }

}
