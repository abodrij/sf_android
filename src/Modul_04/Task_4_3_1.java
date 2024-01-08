package Modul_04;
import java.util.regex.*;
public class Task_4_3_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        long startTime = System.currentTimeMillis();
//        for (int i = 0; i < 1000000; i++) {
//            sb.insert(0, "ABC");
//           sb.append(i);
//           sb.delete(0,1);
//            sb.insert(0,  "ABC");
//            sb.insert(sb.length()/2,"ABC");
//            sb.reverse();
//        }
//        System.out.println((System.currentTimeMillis() - startTime));

//        String text = "aba aba a!a abba adca abea";
//        Pattern pattern = Pattern.compile("a..a");
//        Matcher matcher = pattern.matcher(text);

//        while (matcher.find()) {
//            int start = matcher.start();
//            int end = matcher.end();
//            System.out.println("Found match\n" + text.substring(start, end) + "\nfrom " + start + " to " + (end - 1));
//        }
//        System.out.println("The original text: ");
//        System.out.println(text);
//        System.out.println("Clean the text: ");
//        System.out.println(matcher.replaceAll(" "));
//
//
//        String text_01 = "Егор Алла Александр";
//        Pattern pattern_01 = Pattern.compile("А.+а");
//        Matcher matcher_01 = pattern_01.matcher(text_01);
//        while (matcher_01.find()) {
//            System.out.println(text_01.substring(matcher_01.start(), matcher_01.end()));
//        }


        String text_02 = "2011, adfsdf adf afdf 2025 sdfsdf sfsf 2100 sfsdfs 2301";
        Pattern pattern_02 = Pattern.compile("20\\d{2}");
        Matcher matcher_02 = pattern_02.matcher(text_02);
        while (matcher_02.find()) {
            System.out.println(text_02.substring(matcher_02.start(), matcher_02.end()));
        }
        String text_03 = "Regular Expressions or Regex is an API for defining String patterns that can be used for searching, manipulating and editing a text. It is widely used to define a constraint on strings such as a password. Regular Expressions are provided under java.util.regex package.";
        Pattern pattern_03 = Pattern.compile("\\bs[a-z]*?s\\b");
        Matcher matcher_03 = pattern_03.matcher(text_03);
        while (matcher_03.find()) {
            System.out.println(text_03.substring(matcher_03.start(), matcher_03.end()));
        }
    }
}
