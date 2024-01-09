import AdditionalTasks.Alphabet;
import Bookstore.Book;
import java.util.*;
import static Bookstore.Books_metods.addBook;
import static Bookstore.Books_metods.printAllBookList;
import static java.lang.Math.*;
import Tank.Tank;
public class Main {
    public static void main(String[] args) {

        Alphabet alphabet = new Alphabet();
        alphabet.setW(5);
        System.out.println(alphabet.getSum());
        alphabet.setA(5);
        alphabet.setS(7);
        alphabet.setD(7);
        System.out.println(alphabet.getSum());

//
//        // At (0;0) fuel=100
//        Tank justTank = new Tank();
//        // At (10;10) fuel=100
//        Tank anywareTank = new Tank(10, 10);
//        // At (20;30) fuel=200
//        Tank customTank = new Tank(20, 30, 200);
//        justTank.goForward(200);
//        justTank.printPosition();
//        anywareTank.goBackward(-200);
//        anywareTank.printPosition();
//        customTank.goForward(201);
//        customTank.printPosition();

//        System.out.println("Чтобы узнать длину этой строки в символах, достаточно написать такую команду:".length());

/*
This fragment of code has to output
The Tank is at 100, 0 now.
The Tank is at 110, 10 now.
The Tank is at 220, 30 now.
*/

//        Задание 4.1.1
//        I'VE GOT A TANK! REALLY!

//        Задание 4.1.2
//        MY TANK CAN GO ANYWHERE!

//        Задание 4.1.3
//        THIS IS COOL!

//------------------------------------------------------------------------------------------------------------------------------
//        Book[] bookList = new Book[99];
//
//        Book book1 = new Book();
//        book1.bookName = "The Hobbit";
//        book1.bookPrice = 999;
//        book1.editionYear = 1937;
//
//        addBook(bookList, book1);
//
//        Book book2 = new Book();
//        book2.bookName = "Lord of ring";
//        book2.bookPrice = 888;
//        book2.editionYear = 1939;
//
//        addBook(bookList, book2);
//
//        while (true) {
//            String newLine = System.getProperty("line.separator");
//            System.out.print("Для добавления новой книги введите Y" + newLine + "для печати всего списка книг P" + newLine + "для завершения программы любой другой символ: ");
//            Scanner sc = new Scanner(System.in);
//            char operation = sc.next().charAt(0);
//
//            if ((operation == 'Y') || (operation == 'y')) {
//                Book tempBook = new Book();
//                Scanner sc1 = new Scanner(System.in);
//                System.out.println("Введите наименование новой книги: ");
//                tempBook.bookName = sc1.nextLine();
//                System.out.println("Введите стоимость книги: ");
//                tempBook.bookPrice = sc1.nextInt();
//                System.out.println("Введите год издания книги: ");
//                tempBook.editionYear = sc1.nextInt();
//
//                addBook(bookList, tempBook);
//            }
//            else if ((operation == 'P') || (operation == 'p')){
//                printAllBookList(bookList);
//            }
//            else return;
//        }


// ---------------------------------------------------------------------------------------------------------------------
//        int[] array = new int[11];                  // сейчас array содержит одни нули
//        int value = 5;                              // первое значение для массива array
//        for (int i = 0; i < array.length; i++) {    // обходим весь массив, начиная с 0-го индекса
//            array[i] = value;                       // присваиваем ячейке значения value
//            value++;                                // увеличиваем value на 1 каждый раз (5, 6, 7, ..., 15)
//        }
//        for (int item : array) {                    // равносильно (int i = 0; i < array.length; i++)
//            System.out.println(item);               // печатаем элемент массива
//        }
// ---------------------------------------------------------------------------------------------------------------------


//        String a =  "Sometimes";
//        System.out.println(a.charAt(2));

//        String s1 = "Иван Иванов";
//        String s2 = "Вован иванов";
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equalsIgnoreCase(s2));
//
//        checkUserName(s1,s2);

//        Scanner scanner = new Scanner(System.in);
//        boolean isCorrectName = false;
//        while (!isCorrectName) {
//            System.out.println("Введите имя пользователя: ");
//            String name = scanner.nextLine(); //Считывает строку из System.in
//            name = name.trim();
//            isCorrectName = checkName(name);
//            if (!isCorrectName) System.out.println("Введите корректное имя!");
//            else {
//                System.out.println("Отличное имя - "+ name +"!");
////              checkUserName(s1,name);
//                System.out.println(formatName(name));
//            }
//        }
    }

    private static boolean checkName(String name) {
        String[] words = name.trim().split(" ");
        return words.length == 3;
    }
    private static void checkUserName (String s1,String s2){
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Выберите другое имя пользователя");
        } else {
//                System.out.println("Отличное имя!");
            System.out.println("Ваше имя имеет длину " + s2.length() + " символов");
            String s3 = s2.replace(" ","");
            System.out.println("А без пробелов ваше имя занимает " + s3.length() + " символов");

            String cap = s2.substring(0, 1).toUpperCase() + s2.substring(1);
            System.out.println("Ваше имя будет выглядеть так? - " + cap);
        }
    }
    private static void sortByLength(String[] words) {            // сортировка строки пузырьком
        for (int i = 0; i < words.length - 1; i++) {              // внешний цикл
            for (int j = 0; j < words.length - 1; j++) {          // внутренний цикл
                if (words[j].length() > words[j + 1].length()) {  // если порядок нарушен, то ... меняем местами
                    String tmp = words[j];                        // сохраняем во временной переменной
                    words[j] = words[j + 1];                      // последующую в ячейку текущей
                    words[j + 1] = tmp;                           // из временной востанавливаем значение в последующую переменную
                }
            }
        }
    }

    private static String formatName(String name) {
        String[] words = name.trim().split(" ");      // убираем пробелы в начале и конце исходной строки и разделяем её на массив слов
        sortByLength(words);                                // вызов метода сортировки слов по длине
        String result = "";                                 // инициализация результата выполнения метода
        for (int i = 0; i < words.length; i++) {            // перебор всей исходной строки
            String str = words[i];                          // рабочая сторока - временная
            char firstChar = str.charAt(0);                 // первый символ рабочей строки
            if (!Character.isUpperCase(firstChar)) {        // если первый символ не заглавной буквой то ...
                // к выходной строке добавляем первый символ в верхнем регистре и остаток рабочей строки начиная с индекса 1 + пробел
                result += Character.toUpperCase(firstChar) + str.substring(1) + " ";
            } else {                                        // иначе ....
                // к выходной строке добавляем рабочую строку + пробел
                result += str + "";
            }
        }
        return result;                                      // по окончанию цикла получаем отфарматированную строку
    }

}

// Задание 6.3.3 — разработка (External resource)
// PROTECTED IS NOT SECURE ENOUGH
//import anotherfirm.*;
//public class HackIt {
//
//    public static void main(String[] args) {
//        Hack a = new Hack();
//        a.hack();
//    }
//}
//
//class Hack extends Secret {
//    public void hack() {
//        getSecret();
//    }
//}