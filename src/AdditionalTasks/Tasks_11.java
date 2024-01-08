package AdditionalTasks;
import java.util.*;

public class Tasks_11 {
    public static String text = "Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document or a typeface without relying on meaningful content. Lorem ipsum may be used as a placeholder before final copy is available. It is also used to temporarily replace text in a process called greeking, which allows designers to consider the form of a webpage or publication, without the meaning of the text influencing the design.";
    public static String text1 = "Lorem ipsum is a placeholder text commonly used";
    public static String text2 = "Qtwjr nuxzr nx f uqfhjmtqijw yjcy htrrtsqd zxji";

    public static String encrypt(String text, int shift) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";    // алфавит в верхнем регистре
        String lower = upper.toLowerCase();             // алфавит в нижнем регистре
        char[] encrypted = new char[text.length()];     // результат операции

        while (shift < 0) {
            shift += upper.length();
        }

        for (int i = 0; i < text.length(); i++) {
            if ('A' <= text.charAt(i) && text.charAt(i) <= 'Z') {
                encrypted[i] = upper.charAt((upper.indexOf(text.charAt(i)) + shift) % upper.length());
            } else if ('a' <= text.charAt(i) && text.charAt(i) <= 'z') {
                encrypted[i] = lower.charAt((lower.indexOf(text.charAt(i)) + shift) % lower.length());
            } else {
                encrypted[i] = text.charAt(i);
            }
        }

        return new String(encrypted);
    }

    public static String decrypt(String text, int shift) {
        return encrypt(text, -shift);
    }

    public static void main(String[] args) {
        System.out.println(encrypt(text1, 5));
        System.out.println(encrypt(text2, -5));
    }
}
