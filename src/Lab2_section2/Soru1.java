package Lab2_section2;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author eislamoglu
 */
public class Soru1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        JLabel label = new JLabel("Label");
        JTextField textField = new JTextField("TextField");
        JButton button = new JButton("Button");
        
        frame.setVisible(true);
        frame.add(textField);
        frame.add(label);
        frame.add(button);
        
        frame.setLayout(new FlowLayout());
        
        frame.setSize(300, 300);
    }
}
