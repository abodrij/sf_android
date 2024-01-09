package Add_Tasks_Mod_04;
import java.util.regex.*;

// Исправьте ошибку в шаблоне регулярного выражения. Код должен выводить все слова,
// начинающиеся на букву «с» без учёта регистра.
public class Task_02 {
    public static void main(String[] args) {
        String text = "У Сени и Сани в сенях сом с усами";
//        Pattern pattern = Pattern.compile("\\b[Сс]\\w+\\b");
        Pattern pattern = Pattern.compile("\\b[С,с][а-я]+\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
