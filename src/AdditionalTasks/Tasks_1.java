package AdditionalTasks;
import java.util.*;

public class Tasks_1 {
    public static void main(String[] args) {
        int[] arrInt = {5, 24, 3, 66, 38, 16, 27};
        for (int k : arrInt) {
            System.out.print(k + " ");
        }
        Arrays.sort(arrInt);
//        sortByValue(arrInt);
        System.out.println();
        for (int j : arrInt) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(arrInt[2]);
    }
    private static void sortByValue(int[] values) {             // сортировка строки пузырьком
        for (int i = 0; i < values.length - 1; i++) {           // внешний цикл
            for (int j = 0; j < values.length - 1; j++) {       // внутренний цикл
                if (values[j] > values[j + 1]) {                // если порядок нарушен, то ... меняем местами
                    int tmp = values[j];                        // сохраняем во временной переменной
                    values[j] = values[j + 1];                  // последующую в ячейку текущей
                    values[j + 1] = tmp;                        // из временной востанавливаем значение в последующую переменную
                }
            }
        }
    }
}

