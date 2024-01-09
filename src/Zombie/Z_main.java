package Zombie;

//  INHERITANCE IS THE SUPER THING!   - Ответ задания в платформу обучения.

    /*
    Inherite class Zombie from the class Monster

    This fragment of code has to output

    Monster Alice the Zombie was created
    Monster Alice the Zombie attacked with damage 5
    Raaaauuughhhh Alice the Zombie growled
    Raaaauuughhhh Alice the Zombie growled
    Monster Bob the Zombie was created
    Monster Bob the Zombie attacked with damage 5
    Raaaauuughhhh Bob the Zombie growled
    Raaaauuughhhh Bob the Zombie growled

    NOTE: The code of Zombie class has to output
          SMALL part of this.

    The most output class Monster makes.
    You cannot see Monster class source,
    but can instance objects of it and play with them.
    */
public class Z_main {
    public static void main(String[] args) {
//        Zombie zombie1 = new Zombie("Alice");
//        zombie1.attack();
//        zombie1.growl();
//        Zombie zombie2 = new Zombie("Bob");
//        zombie2.attack();
//        zombie2.growl();
//    }
      /*
Make the class Battle (add your code there)
to allow monsters to fight
*/
            Battle battle = new Battle();
            battle.add(new Zombie("Alice"));
            battle.add(new Zombie("Bob"));
            battle.add(new Zombie("Eve"));
            battle.add(new GiantSnake("Kaa"));
            battle.add(new GiantSnake("Son of Kaa"));

            battle.add(new Zombie("Noname"));
            battle.add(new GiantSnake("Noname"));

            battle.start();

/*
This fragment of code has to output

Monster Alice the Zombie was created
Monster Bob the Zombie was created
Monster Eve the Zombie was created
Monster Kaa the GiantSnake was created
Monster Son of Kaa the GiantSnake was created
Monster Noname the Zombie was created
No more monsters!
Monster Noname the GiantSnake was created
No more monsters!
Monster Alice the Zombie attacked with damage 5
Raaaauuughhhh Alice the Zombie growled
Monster Bob the Zombie attacked with damage 5
Raaaauuughhhh Bob the Zombie growled
Monster Eve the Zombie attacked with damage 5
Raaaauuughhhh Eve the Zombie growled
SSSSSS Kaa the GiantSnake growled
Monster Kaa the GiantSnake attacked with damage 5
     ...and hid in the grass
SSSSSS Son of Kaa the GiantSnake growled
Monster Son of Kaa the GiantSnake attacked with damage 5
     ...and hid in the grass

But the Buttle class has ony one println "No more monsters!"

*/

    }
}
