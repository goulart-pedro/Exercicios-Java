package gui;

/**
 * Program that creates a GUI with a button that when clicked
 * increments the click count displayed in a label
 */

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    /*
     * adds the action listener defined in "button.addActionListener(this)"; Must
     * have a method to perform the action, in this case: "actionPerformed"
     */

    /*
     * Declaration of objects here as so they are in the global scope to be read by
     * the method that performs the action events
     */

    private JFrame frame;
    private JLabel label;
    private JPanel panel;
    int count = 0; // integer to count the number of clicks

    public GUI() {

        /**
         * Creates the ojects
         */
        frame = new JFrame(); // creates a frame for the swing objects
        panel = new JPanel();
        label = new JLabel("Number of clicks: " + count);
        JButton button = new JButton("Click Me");

        /**
         * configures the objects
         */
        button.addActionListener(this); // adds a click event to the button declared in the global scope
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));

        /**
         * add the objects to the screen
         */
        panel.add(button);
        panel.add(label);

        /**
         * standard configuration of objects
         */
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI(); // creates the GUI in the main class
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        count++;
        label.setText("Number of clicks: " + count);
        /*
         * apparently simply incrementing the count doesn't display it so the text must
         * changed entirely
         */

    }
}
