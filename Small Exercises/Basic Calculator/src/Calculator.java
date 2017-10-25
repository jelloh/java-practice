/**
 * Answer for the Fall 2017 ITSC 1212
 * Activity 6.1 programming exercise
 *
 * @version 10/24/2017
 *
 */

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        // Declare Scanner
        Scanner scan = new Scanner(System.in);
        // Declare int to hold user choice
        int choice;

        do {
            // Get user's choice using displayMenu() method
            choice = displayMenu();

            // Perform a specific operation based on the user's choice...
            // Addition
            if (choice == 1) {
                System.out.print("Enter two numbers to add: ");
                int num1 = scan.nextInt();
                int num2 = scan.nextInt();
                System.out.println("Sum = " + add(num1, num2));
            }
            // Subtraction with int
            else if (choice == 2) {
                System.out.print("Enter two numbers (ints) to subtract: ");
                int num1 = scan.nextInt();
                int num2 = scan.nextInt();
                System.out.println("Subtraction = " + subtract(num1, num2));
            }
            // Subtraction with doubles
            else if (choice == 3) {
                System.out.print("Enter two numbers (doubles) to subtract: ");
                double num1 = scan.nextDouble();
                double num2 = scan.nextDouble();
                System.out.println("Subtraction = " + subtract(num1, num2));
            }
            // Multiplication
            else if (choice == 4) {
                System.out.print("Enter two numbers to multiply: ");
                double num1 = scan.nextDouble();
                double num2 = scan.nextDouble();
                System.out.println("Multiplication = " + multiplication(num1, num2));
            }
            // Division
            else if (choice == 5) {
                System.out.print("Enter two numbers to divide: ");
                double num1 = scan.nextDouble();
                double num2 = scan.nextDouble();
                System.out.println("Division = " + division(num1, num2));
            }

            // Just to add some spacing and make the output pretty :')
            System.out.println();

        }while(choice != 0);

        // Display message when user quits
        System.out.println("Goodbye!!");

    } // end main method

    // Displays the menu and returns the user's choice as an int
    public static int displayMenu(){

        // Declare Scanner
        Scanner scan = new Scanner(System.in);

        // Display options
        System.out.println("0. Quit");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Subtract with doubles");
        System.out.println("4. Multiple");
        System.out.println("5. Divide");

        // Get user input
        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();

        // Input Validation (there are multiple ways of doing this)
        while(choice < 0 || choice > 5){
            System.out.println("Invalid Input. Must be between 0 and 5.");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
        }

        // Return the user's choice
        return choice;

    }

    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static double subtract(double a, double b){
        return a - b;
    }

    // Create a multiplication method that returns a double
    public static double multiplication(double num1, double num2){
        return num1 * num2;
    }

    // Create a division method that returns a double
    public static double division(double x, double y){
        return x / y;

    }


} // end class