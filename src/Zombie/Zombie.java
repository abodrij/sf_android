package Zombie;

public class Zombie extends Monster {
    public static String scream = "Raaaauuughhhh";
    // конструктор
    public Zombie(String name) {
        super(name + " the Zombie", 5);

    }

    public void growl(){
        System.out.print(scream);
        super.growl();
    }

//    Задание 6.4.5 — разработка (External resource)
//    OVERRIDING AND OVERLOADING ARE DIFFERENT THINGS
    public void growl(boolean loud){
        if (!loud) {
            growl();
        }
        else {
            System.out.print(scream.toUpperCase());
            super.growl();
        }
    }

    public void attack(){
        super.attack();
        growl();
    }
}
