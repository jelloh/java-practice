/**
 * --- Jk. These are the instructions:
 *
 * Ask the user to enter how many numbers they want to enter. ------------------------ x
 * Allow them to enter that amount of numbers. For all the numbers, keep track ------- x
 * of how many are even or odd.  -----------------------------------------------------
 * Display the # of even and odd numbers at the end. ---------------------------------
 */
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int evens = 0;

        System.out.println("How many numbers do you want to enter?");
        int potato = scan.nextInt();

        for(int i = 0; i < potato; i++){
            System.out.print("Enter number " + i + ": ");
            int num = scan.nextInt();

            // Count evens
            // if number is even, increment "evens" variables
            if(isEven(num)){
             evens++;
            }


        } // end for loop
        System.out.println("Evens is " + evens);

    } // end main() method

    // Method that will return TRUE or FALSE based on whether
    // the INPUTTED (parameter) number is EVEN
    public static boolean isEven(int a){
        // if a is even -> return true
        if(a % 2 == 0){
            return true;
        }
        // else return false
        else {
            return false;
        }
    }



}
