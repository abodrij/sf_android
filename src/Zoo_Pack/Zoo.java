package Zoo_Pack;

public class Zoo {
    Object[] animals;

    public Zoo(){
        // ? ???? ?????? ?? ??? ?? ??????? ????????
        animals = new Object[3];
        // ????????? ?????? ??????????? ?????????
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Reptile();
    }

    public void print(){
        // ?????????? ????
        // ?????? ???????? ????????? ??-??????!
        for (Object a : animals){
            System.out.println(a);
        }

    }
//    Zoo: [I am a Dog, I am a Cat, I am a Dog]
    public String toString(){
        return "Zoo: ["+animals[0] +", "+animals[1] +", "+ animals[2]+"]";
    }

    public void  change(Object a, int i){
        if (i >= 0 && i < animals.length)
            animals[i] = a;
    }
}
