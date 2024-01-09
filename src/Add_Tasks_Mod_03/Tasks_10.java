package Add_Tasks_Mod_03;

public class Tasks_10 {
    public static String string = "helloworld";
    public static void main(String[] args) {
        while (string.length()>=2){
            System.out.println(string);
            string = string.substring(1,string.length()-1);
        }
    }
}
