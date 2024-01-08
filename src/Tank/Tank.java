package Tank;
import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Tank {
    static final String MODEL = "T34";
    static int ntanks;
    private int x;
    private int y;
    private byte direction;
    private int fuel;
    private int maxDist;
    private int n;
    private String tankName;

    // --- Конструкторы класса ---------------------------------
    // Конструктор по умолчанию

    public Tank() {
        this.x = 0;
        this.y = 0;
        this.fuel = 100;
        n = ++ ntanks;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
        this.fuel = 100;
        n = ++ ntanks;
    }

    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        n = ++ ntanks;




    }

    // --- Методы класса ---------------------------------------
    public void printPosition() {
        System.out.println("The Tank " + MODEL + "-" + this.n + " is at " + this.x + ", "  + this.y + " now.");
    }

    public void turnRight() {
        this.direction = (byte) ((this.direction+1) % 3);
    }

    public void turnLeft() {
        this.direction = (byte) ((this.direction-1) % 3);
    }

    public void goForward(int d) {
        if (d<0){
            this.goBackward(abs(d));
            return;
        }
        maxDist = min(abs(d),this.fuel);
        this.fuel -= maxDist;
        switch (this.direction) {
            case 0:
                x += maxDist;
                break;
            case 1:
                y += maxDist;
                break;
            case 2:
                x -= maxDist;
                break;
            case 3:
                y -= maxDist;
                break;
        }
    }

    public void goBackward(int d) {
        if (d<0){
            this.goForward(abs(d));
            return;
        }
        maxDist = min(abs(d),this.fuel);
        this.fuel -= maxDist;
        switch (this.direction) {
            case 0:
                x -= maxDist;
                break;
            case 1:
                y -= maxDist;
                break;
            case 2:
                x += maxDist;
                break;
            case 3:
                y += maxDist;
                break;
        }
    }

    // --- Get Set --------------------------------------------
    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
