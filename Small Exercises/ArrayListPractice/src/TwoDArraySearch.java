import java.util.Scanner;

public class TwoDArraySearch {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        // Part A
        String[][] people = new String[2][5];

        // Part B
        for(int column = 0; column < people[0].length; column++){
            // Part C
            System.out.print("Enter name: ");
            people[0][column] = scan.next();
            // Part D
            System.out.print("Enter age: ");
            people[1][column] = scan.next();
        }

        // Part E
        print2DArray(people);

        // Part I
        System.out.print("Who are you searching for?");
        String searchedName = scan.next();

        // Part K
        int foundIndex = searching(people[0], searchedName);


        if(foundIndex == -1){
            System.out.println("I'm sorry. We could not find that person.");
        }
        else{
            // Part L
            System.out.println("We found " + people[0][foundIndex] + "!");
            System.out.println("That person is " + people[1][foundIndex] + " years old.");
        }

    }

    // Part F
    public static void print2DArray(String[][] array){
        for(int row = 0; row < array.length; row++){
            for(int column = 0; column < array[row].length; column++){
                // Part G
                System.out.print(array[row][column] + "\t");
            }
            // Part H
            System.out.println();
        }
    }

    // Part J
    public static int searching(String[] array, String key){
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(key)){
                return i;
            }
        }

        return -1;
    }
}

