public class OOPSFIFT {
    public static void main(String[] args) {
        Horse h = new Horse();
    }
}

class Animal {
    Animal(){
        System.out.println("Animal constrctor is called!");
    }
}


class Horse extends Animal{
    Horse(){
        super();
        System.out.println("Horse constrctor is called!");
    }
}