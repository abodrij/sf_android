package Zoo_Pack;

public class Dog extends Animal{
    public void print(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "I am an Dog";
    }
}
