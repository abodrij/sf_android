package AdditionalTasks;
import java.util.Arrays;

public class Tasks_5 {
    public static int[] numbers = new int[100];

    public static void main(String[] args) {
        for(int i = 0; i < numbers.length; i++) {
            if(i%2==0) numbers[i]=i+1;
            else numbers[i]=0-(i+1);
        }

        System.out.println(Arrays.toString(numbers));
    }
// Tasks 6
//    public static int[] numbers = new int[30];
//
//    public static void main(String[] args) {
//        for(int i = 0; i < numbers.length; i++) {
//            if((i==0)||(i==1)) numbers[i]=1;
//            else numbers[i]=numbers[i-1]+numbers[i-2];
//        }
//        System.out.println(Arrays.toString(numbers));
//    }


}
