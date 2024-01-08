package Zombie;

public class Monster {
    private  String monsterName;
    private int monsterDamage;

//     конструктор:
    public Monster(String s, int i) {
        monsterName = s;
        monsterDamage = i;
        System.out.println("Monster " + monsterName + " was created");
    };

    //    Метод, который выводит рёв монстра:
    public void growl(){
        System.out.println(" " + monsterName + " growled");
    };

//    Метод, который выводит информацию о силе разрушения, которое наносит монстр:
    public void attack(){
        System.out.println("Monster " + monsterName + " attacked with damage "+ monsterDamage);
    };
}