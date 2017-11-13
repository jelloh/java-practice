import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) throws IOException {
        // Part A
        File file = new File("hello_world.txt");

        // Part B
        Scanner fileInput = new Scanner(file);

        // Part C
        while(fileInput.hasNext()){
            // Part D
            String firstName = fileInput.next();
            // Part E
            int age = fileInput.nextInt();

            // Part F
            System.out.println("Name is " + firstName + ". Age is " + age + ".");
        }

        // Part G
        fileInput.close();

    }
}
