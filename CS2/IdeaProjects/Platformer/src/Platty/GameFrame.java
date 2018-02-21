package Platty; /**
 * Created by cody.mellon on 3/11/16.
 */

import javax.swing.*;
import java.awt.*;

public class GameFrame {
    public static Dimension windowSize = new Dimension(800,600);

    public static String windowName = "Platty";
    public static JFrame frame;
    public static JPanel panel;
    public static void main(String[] args) {
        JFrame frame = new JFrame(windowName);
        JPanel panel = new Panel();
        frame.setSize(windowSize);
        frame.add(panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        }
}
