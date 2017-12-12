import java.util.Scanner;

public class ParallelArraySearch {
    public static void main(String[] args){

        // Part A
        int[] age = {5, 70, 25, 30, 18, 20, 52};
        String[] name = {"Kid", "Fred", "Samantha", "Alex", "Kyle", "Alice", "Sandra"};

        // Part B
        Scanner scan = new Scanner(System.in);
        System.out.println("Who are you looking for? ");
        String search = scan.next();

        // Part D
        int foundIndex = searching(name, search);

        // Part E
        if(foundIndex == -1){
            System.out.println("I'm sorry. We could not find that person.");
        }
        // Part F
        else{
            System.out.println("We found " + name[foundIndex] + "!");
            System.out.println("That person is " + age[foundIndex] + " years old.");
        }

    }

    // Part C
    public static int searching(String[] array, String key){
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(key)){
                return i;
            }
        }

        return -1;
    }
}
