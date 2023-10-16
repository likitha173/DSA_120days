public class SuperKeyword {
    public static void main(String args[]){
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal {
    String color;
    Animal() {
        System.out.println("Animal construtor is called");
    }
}
class Horse extends Animal {
    Horse() {
        super.color = "blue";
        System.out.println("Horse construtor is called");
    }
}
