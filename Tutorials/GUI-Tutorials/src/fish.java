/**
 * GUI 3: Event Handling and Action Listener
 * Bucky Tutorial:
 * https://www.youtube.com/watch?v=3EE7E3bvfe8
 * https://www.youtube.com/watch?v=qhYook53olE
 *
 * @author Aileen
 * @version 10/22/2017
 *
 */

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.xml.ws.Action;

public class fish extends JFrame{

    // variables
    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField passwordField;

    // the constructor
    public fish(){
        // Create the window
        super("Title. Teehee");
        setLayout(new FlowLayout());

        // Adding items
        item1 = new JTextField(10); // parameter = length (?)
        add(item1);

        item2 = new JTextField("Enter text here");
        add(item2);

        item3 = new JTextField("Uneditable", 20);
        item3.setEditable(false); // cant edit it heehee
        add(item3);

        passwordField = new JPasswordField("mypass");
        add(passwordField);


        // Add all the action listeners
        thehandler handler = new thehandler();
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }


    ///////////////////////////////////////////////////////////////////////////
    // Event Handling class that implements ActionListener
    ///////////////////////////////////////////////////////////////////////////
    private class thehandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            String string = "";

            // if they clicked enter on textfield item1
            if(e.getSource() == item1){
                // e.getActionCommand() gets the text from that location
                string = String.format("field 1: %s", e.getActionCommand());
            }
            else if(e.getSource() == item2){
                string = String.format("field 2: %s", e.getActionCommand());
            }
            else if(e.getSource() == item3){
                string = String.format("field 3: %s", e.getActionCommand());
            }
            else if(e.getSource() == passwordField){
                string = String.format("password field is: %s", e.getActionCommand());
            }

            // Blank window
            // parentComponent => positioning
            JOptionPane.showMessageDialog(null, string);

        }
    }
}
