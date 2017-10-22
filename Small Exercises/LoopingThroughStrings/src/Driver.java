import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aileen
 * @version 10/22/2017
 *
 * For a 1212 class activity on Strings, Loops, and Basic Arrays
 */

public class Driver {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        char goAgain = 'N';

        do {
            // Allow user to enter a String
            System.out.print("Enter some string: ");
            String str = scan.nextLine();

            // Create an array based on the string's length
            char[] letters = new char[str.length()];

            // Now loop through each character
            for (int i = 0; i < letters.length; i++) {
                letters[i] = str.charAt(i);
            }

            // Loop through the character array and display each character
            // separated by dashes
            for (int i = 0; i < letters.length; i++) {
                System.out.print(letters[i] + "-");
            }
            System.out.println();

            // Also display the array using Arrays.toString(arrayName)
            System.out.println(Arrays.toString(letters));

            // Ask if user would like to go again
            System.out.println("Would you like to go again?");
            System.out.print("Enter Y or N: ");
            goAgain = scan.next().charAt(0);

            scan.nextLine(); // clear any extra stuff before next iteration
            System.out.println(); // extra line for pretty formatting

        }while(goAgain == 'Y' || goAgain == 'y');

        // Goodbye!
        System.out.println("Goodbye! Hope you had fun :')");

    }

}
