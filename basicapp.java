import javax.swing.*;

public class BasicApp {
    public static void main(String[] args) {
        // Create the main window (JFrame)
        JFrame frame = new JFrame("My Basic Java App");

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set size of the window
        frame.setSize(300, 200);

        // Add a simple label
        JLabel label = new JLabel("Hello Ranjit, this is a basic Java application!", SwingConstants.CENTER);
        frame.getContentPane().add(label);

        // Make the window visible
        frame.setVisible(true);
    }
}
