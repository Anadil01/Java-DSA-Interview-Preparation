public class OOPSTWO {
    public static void main(String[] args) {
        Horse h =  new Horse();
        h.eat();
        h.walk();

        Chicken ch = new Chicken();
        ch.eat();
        ch.walk();

    }
}


abstract class Animal{
    String color;
    Animal(){
        color= "brown";
    }
    void eat(){
        System.out.println("Animal eat");
    }
    abstract void walk();
}


class Horse extends Animal{
    void changeColor(){
     color = "dark Brown";
    }
    void walk(){
        System.out.println("Walks on 4 lags");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.print("Walks on two lags");
    }
}