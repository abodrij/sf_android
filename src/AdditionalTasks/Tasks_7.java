package AdditionalTasks;
import java.util.*;

public class Tasks_7 {
    public static short size = 9;
    public static int[][] ints = new int[size][];

    public static void main(String[] args) {
        int n = size;
        for (int i = 0; i < size; i++) {
            ints[i] = new int[n];
            for (int j = 0; j < n; j++) {
                if((i == 0)||(j == 0)){
                    ints[i][j] = 1;
                }
                else {
                    ints[i][j] = ints[i][j-1] + ints[i-1][j];
                }
                if(ints[i][j]<10){
                    System.out.print(ints[i][j]+"  ");
                }
                else {
                    System.out.print(ints[i][j]+" ");
                }
            }
            n -= 1;
            System.out.println();
        }

        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(ints[i]));
        }
    }
}
