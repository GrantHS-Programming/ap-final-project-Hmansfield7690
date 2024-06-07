import javax.swing.*;
import javax.swing.ImageIcon;

public class Graphics {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My first JFrame");
        frame.setSize(1000, 1000);
        ImageIcon tvstatic = new ImageIcon("actualstatic.jpeg");
        frame.add(new JLabel(tvstatic));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
