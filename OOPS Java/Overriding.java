public class Overriding {
    public static void main(String agrs[]){
        Deer d = new Deer();
        d.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}
class Deer {
    void eat() {
        System.out.println("eats grass");
    }
}