package Add_Tasks_Mod_04_RegEx;
import java.util.regex.*;

// Исправьте ошибку в шаблоне регулярного выражения. Код должен выводить все слова,
// начинающиеся на букву «с» без учёта регистра.
public class Task_02 {
    public static void main(String[] args) {
        String text = "У Сени и Сани в сенях сом с усами 2024 Cdfdllaf Cani i Ceni";
//        Pattern pattern = Pattern.compile("\\b[Сс]\\w+\\b");   ("20\\d{2}")   ("\\b[сС]+[а-я]+\\b")
        Pattern pattern = Pattern.compile ("\\b[сС][а-я]+\\b");
//        Pattern pattern = Pattern.compile("\\b[Cc][a-z]+\\b");    // reshenie
//        Pattern pattern = Pattern.compile("20\\d{2}");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
