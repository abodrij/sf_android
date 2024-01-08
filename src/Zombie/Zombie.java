package Zombie;

public class Zombie extends Monster {
    // конструктор
    public Zombie(String name) {
        super(name + " the Zombie", 5);

    }

    public void growl(){
        System.out.print("Raaaauuughhhh");
        super.growl();
    }

    public void attack(){
        super.attack();
        growl();
    }
}
