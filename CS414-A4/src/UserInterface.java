import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UserInterface {
	private static void createAndShowGUI() {
        JFrame frame = new JFrame("Pizza Ordering System");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
        
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        JButton btnViewMenu = new JButton("View Menu");
        JButton btnDefineMenu = new JButton("Define Menu");
        JButton btnModifyMenu = new JButton("Modify Menu");
        JButton btnSetDailySpecial = new JButton("Set Daily Special");
        frame.add(btnViewMenu);
        frame.add(btnDefineMenu);
        frame.add(btnModifyMenu);
        frame.add(btnSetDailySpecial);
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
