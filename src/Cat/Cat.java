package Cat;

public class Cat {

    // --- Поля класса -----------------------------------------
    private double weight;
    private String name;
    private int age;
    private String color;
    private static int catCount; //Статичное поле


    // --- Конструкторы класса ---------------------------------
    // Конструктор по умолчанию
    public Cat() {
        //вызов другого конструктора
        this(3000, "Barsik", 1, "Grey");
    }

    // Конструктор, принимающий параметры
    public Cat(double weight, String name, int age, String color) {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
        catCount++; //Увеличиваем счётчик кошек
    }

    // --- Методы класса ---------------------------------------
    void meow() {
        System.out.println("Meow");
    }

    void pee() {
        weight -= 20;
    }

    void eat() {
        weight += 50;
    }
}
