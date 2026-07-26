public class Inheritence {
    public static void main(String[] args) {

        Fish shark = new Fish();
        shark.eat();
        Dog doggy = new Dog();
        doggy.eat();
        doggy.legs = 4;
    }
}


class Animal{   // Single level inheritence
    String color;

    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }

}

class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swiming!");
    }
}


class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breed;
}