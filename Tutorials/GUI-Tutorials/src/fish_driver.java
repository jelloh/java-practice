/**
 * GUI 3: Event Handling and Action Listener
 * Bucky Tutorial yayay:
 * https://www.youtube.com/watch?v=3EE7E3bvfe8
 * https://www.youtube.com/watch?v=qhYook53olE
 * https://www.youtube.com/watch?v=M1_-sigEPtE
 *
 * @author Aileen
 * @version 10/22/2017
 *
 */

import javax.swing.JFrame;


public class fish_driver {
    public static void main(String[] args){

        // Creating object
        fish teehee = new fish();
        // Let x button close program
        teehee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set window size
        teehee.setSize(350, 100);
        // Set Visibility
        teehee.setVisible(true);

    }
}
