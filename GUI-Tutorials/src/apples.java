/**
 * GUI 1
 * Bucky Tutorial yayay:
 * https://www.youtube.com/watch?v=jJjg4JweJZU
 *
 * @author Aileen
 * @version 10/21/2017
 *
 * Learning GUI Stuff!!!!
 */

// import this for GUI stuff
import javax.swing.JOptionPane;

public class apples {

    public static void main(String[] args){

        // get values from user (however, only takes in Strings)
        String fn = JOptionPane.showInputDialog("Enter first number");
        String sn = JOptionPane.showInputDialog("Enter second number");

        // convert those Strings to actual ints now to do math
        int num1 = Integer.parseInt(fn);
        int num2 = Integer.parseInt(sn);
        int sum = num1 + num2; // ez

        // Show sum
        // parentComponent is the position of the box. null means center of screen
        JOptionPane.showMessageDialog(null,
                "The answer is " + sum, "title here wowowow",
                JOptionPane.PLAIN_MESSAGE);




    }

}
