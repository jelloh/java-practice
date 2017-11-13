import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class Practice1 {
    public static void main(String[] args) throws IOException {

        // Part A
        File file = new File("hello_world.txt");

        // Part B
        PrintWriter fileOutput = new PrintWriter(file);

        // Part C
        fileOutput.print("Bob ");
        fileOutput.println(90);
        fileOutput.print("Alice ");
        fileOutput.println(25);
        fileOutput.print("George ");
        fileOutput.println(16);

        // Part D
        fileOutput.close();

    }
}
