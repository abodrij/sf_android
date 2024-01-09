package Add_Tasks_Mod_03;

public class Tasks_9 {
    public static short size = 16;
    public static String[][] strings;

    public static void main(String[] args) {
        strings = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((size - i)<10) {
                    strings[i][j] = (char) ('A' + j) + String.valueOf(size - i)+" ";
                }
                else{
                    strings[i][j] = (char) ('A' + j) + String.valueOf(size - i);
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(String.join(" ", strings[i]));
        }
    }
}
