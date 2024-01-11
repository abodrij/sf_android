package Add_Tasks_Mod_04_RegEx;
import java.util.regex.*;

// Нам требуется вывести латинский текст без учета регистра. В нем допущены ошибки.
// Требуется регулярным выражением проверить текст и вывести на экран.
public class Task_04 {
    public static void main(String[] args) {
        String stringTest = "[a-zA-Z]";
        String text = "1It is 2interesting TO 4study VERY666, Делайте обучение интересней";
        Pattern pattern = Pattern.compile(stringTest);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
