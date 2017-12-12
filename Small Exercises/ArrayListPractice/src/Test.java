public class Test {
    public static void main(String[] args){
        int[][] array = {{1, 2, 3}, {4, 5}, {6}};
        int sum = 0;
        for (int r = 0; r < array.length; r++) {
            for (int c=0; c<array.length; c++){
                sum += array[r][c];
            }
        }
        System.out.println(sum);
    }
}
