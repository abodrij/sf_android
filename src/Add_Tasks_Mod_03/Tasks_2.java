package Add_Tasks_Mod_03;

public class Tasks_2 {
    public static void main(String[] args) {
        int sumPoints = 0;
        int[][] points = {
                {4, 3, 2, 5, 1},
                {3, 4, 4, 6, 2},
                {2, 5, 4, 3, 2},
                {8, 4, 2, 0, 4},
                {4, 4, 3, 2, 9},
        };
        String[] names = {"Саша", "Игорь", "Миша", "Коля", "Владимир"};
        String[] result = new String[5];
        for (int i = 0; i < points.length; i++){
            sumPoints = 0;
            for (int j= 0; j < points[i].length; j++){
                sumPoints += points[i][j];
            }
            result[i] = names[i] + " " + String.valueOf(sumPoints);
            System.out.println(result[i]);
       }
    }

}
