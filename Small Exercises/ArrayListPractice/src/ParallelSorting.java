import java.util.ArrayList;
import java.util.Arrays;

public class ParallelSorting {

    public static void main(String[] args) {

        String[] firstNames = {"A-a-Ron", "Ba-La-kay", "Bob", "Zeke", "Rengar", "Cat", "Bumble"};
        String[] lastNames = {"Smith", "McGrath", "McDonald", "Harbinger", "Wick", "Cutie", "Bee"};
        int[] age = {18, 13, 18, 19, 22, 25, 24};
        int[] index = {0, 1, 2, 3, 4, 5, 6};

        //Part 1
        System.out.println("Names Originally: ");
        printArray(firstNames, lastNames, age);

        //Part 2
        System.out.println("\n\nNames After Sorting Based on First Name without indexArray");
        Arrays.sort(firstNames);
        printArray(firstNames, lastNames, age);
        //Reset first names to normal since it was changed in earlier sort
        firstNames = new String[]{"A-a-Ron", "Ba-La-kay", "Bob", "Zeke", "Rengar", "Cat", "Bumble"};

        //Part 3
        System.out.println("\n\nNames After Sorting Based on Last Name without indexArray");
        Arrays.sort(lastNames);
        printArray(firstNames, lastNames, age);
        //reset last names to normal since it was changed in earlier sort
        lastNames = new String[]{"Smith", "McGrath", "McDonald", "Harbinger", "Wick", "Cutie", "Bee"};

        //Part 4
        sort(lastNames, index);
        System.out.println("\n\nNames After Sorting Based on Last Name WITH indexArray");
        printArray(firstNames, lastNames, age, index);
        //reset index to normal since it was changed in earlier sort
        index = new int[]{0, 1, 2, 3, 4, 5, 6};

        //Part 5
        sort(firstNames, index);
        System.out.println("\nNames After Sorting Based on First Name WITH indexArray");
        printArray(firstNames, lastNames, age, index);
        //reset index to normal since it was changed in earlier sort
        index = new int[]{0, 1, 2, 3, 4, 5, 6};

        //Part 6
        sort(age, index);
        System.out.println("\nNames After Sorting Based on Age WITH indexArray");
        printArray(firstNames, lastNames, age, index);


    }

    public static void sort(String[] array, int[] indexArray){

        String[] array2 = array.clone();

        for(int k = 1; k < array.length; k++){
            for(int i = 0; i < array.length - k; i++){
                if(array2[i].compareTo(array2[i+1]) > 0) {
                    swap(indexArray, i, (i + 1));
                    swap(array2, i, (i + 1));
                }
            }
        }
    }

    public static void sort(int[] array, int[] indexArray){

        int[] array2 = array.clone();

        for(int k = 1; k < array.length; k++){
            for(int i = 0; i < array.length - k; i++){
                if(array2[i] > (array2[i+1]) ) {
                    swap(indexArray, i, (i + 1));
                    swap(array2, i, (i + 1));
                }
            }
        }
    }

    
    // Swaps two elements in array a. first and second are indices
    public static void swap(int[] a, int first, int second){
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }

    public static void swap(String[] a, int first, int second){
        String temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }

    public static void printArray(String[] firstNames, String[] lastNames, int[] age){
        for(int i = 0; i < firstNames.length;i++){
            System.out.print("  " + firstNames[i] + " " + lastNames[i] + "(" + age[i] + ")" + ", ");
        }
    }

    public static void printArray(String[] firstNames, String[] lastNames, int[] age, int[]index){
        for(int i = 0; i < index.length;i++){
            System.out.print("  " + firstNames[index[i]] + " " + lastNames[index[i]] + "(" + age[index[i]] + ")" + ", ");
        }
        System.out.println();
    }


}
