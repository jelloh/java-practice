/**
 * GUI 2
 * Bucky Tutorial yayay:
 * https://www.youtube.com/watch?v=jUdIAgJ7JKo
 *
 * @author Aileen
 * @version 10/21/2017
 *
 */

import javax.swing.JFrame;

public class tuna_driver {
    public static void main(String[] args){

        tuna teehee = new tuna();
        // *** THis is important. without this you cant close it
        teehee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        teehee.setSize(275,180); // window size
        teehee.setVisible(true);

    }

}
