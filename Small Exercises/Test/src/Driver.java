import java.util.Scanner;

public class Driver {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        /* QUESTION 1 */
        System.out.print("Enter the following for your window...\n");
        System.out.print("Title: ");
        String title = scan.nextLine();
        System.out.print("Width: ");
        int screenWidth = scan.nextInt();
        System.out.print("Height: ");
        int screenHeight = scan.nextInt();

        Detector d = new Detector(title, screenWidth, screenHeight);

        do {
        /* QUESTION 2 */
            System.out.println("\nWhat shape would you like to add?");
            System.out.println("1. Triangle\n2. Square\n3. Rectangle\n4. Circle");
            System.out.print("Enter your choice (1-4) > ");
            int shape = scan.nextInt() - 1;

        /*  QUESTION 3 */
            System.out.println("\nWhat will be the location of your new shape?");
            System.out.print("Enter X: ");
            int x = scan.nextInt();
            System.out.print("Enter Y: ");
            int y = scan.nextInt();

            System.out.println("\nWhat size is your shape?");

            switch (shape) {
                case 0:
                case 1:
                case 2:
                    System.out.print("Enter shape width: ");
                    int shapeWidth = scan.nextInt();
                    System.out.print("Enter shape height: ");
                    int shapeHeight = scan.nextInt();
                    d.addShape(shape, x, y, shapeWidth, shapeHeight);
                    break;
                case 3:
                    System.out.print("Enter radius: ");
                    int radius = scan.nextInt();
                    d.addShape(shape, x, y, radius);
                    break;
            }



        /* QUESTION 4 */
            System.out.println("\nWould you like to add a point?");
            System.out.print("Enter Y or N > ");
            char addPoint = scan.next().charAt(0);
            int pointX, pointY;
            if (addPoint == 'Y' || addPoint == 'y') {
                System.out.println("\nWhat is the location for your point?");
                System.out.print("Enter X: ");
                pointX = scan.nextInt();
                System.out.print("Enter Y: ");
                pointY = scan.nextInt();
                d.addPoint(pointX, pointY);

                if (d.isPointInShapes(pointX, pointY)) {
                    System.out.println("\n\nPoint is in shape!");
                } else {
                    System.out.println("\n\nPoint is not in shape!");
                }
            }

        }while(true);




    }
}
