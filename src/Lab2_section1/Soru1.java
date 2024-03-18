package Lab2_section1;

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
        JLabel label = new JLabel("text");
        JButton button = new JButton("button");
        JTextField textField = new JTextField("text field");
        
        frame.add(label);
        frame.add(button);
        frame.add(textField);
        
        frame.setLayout(new GridLayout());
        
        frame.setSize(300, 300);
        
        frame.setVisible(true);
    }
}
