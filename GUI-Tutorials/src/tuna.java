/**
 * GUI 2
 * Bucky Tutorial yayay:
 * https://www.youtube.com/watch?v=jUdIAgJ7JKo
 *
 * @author Aileen
 * @version 10/21/2017
 *
 */

// "how things are placed" default layout managing
import java.awt.FlowLayout;
// all the basic windows features (title bar, min/max, window, etc...)
import javax.swing.JFrame;
// lets you output text and images
import javax.swing.JLabel;

public class tuna extends JFrame {

    // our item. yay
    private JLabel item1;

    // constructor
    public tuna(){
        // i guess we use super() here because of the " extends JFrame"
        super("The title bar");
        // gives us default layout
        setLayout(new FlowLayout());

        // now we are building the actual item
        item1 = new JLabel("this is a sentence");
        item1.setToolTipText("this is gnna show up on hover");
        add(item1); // adds item to the window


    }



}
