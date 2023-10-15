public class Abstraction {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        System.out.println(h.color);

        Horse hors = new Horse();
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "Brown";
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        color = "Brown";
        System.out.println("Horse constructor called");
    }

    void walk() {
        System.out.println("Walks on 4 legs");
    }

    void changeColor() {
        System.out.println("drak brown");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}
