public class Inheritance {
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();

        Dog dobby = new Dog();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}
 
//base class
class Animal {
    String color; 

    void eat() {
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breathes");
    }
}

// Dervied Class
class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal{
    String breed;
}


// Dervied Class
class Fish extends Animal {
    int fins;

    void swin(){
        System.out.println("swims in water");
    }
}
