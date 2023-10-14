public class Overloading {
    public static void main(String args[]){
        Calculator calc = new Calculator();
       System.out.println(calc.sum(5, 50));
       System.out.println(calc.sum((float)5.2, (float)5.0));
       System.out.println(calc.sum(5, 50, 2));
    }
}

class Calculator {
    int sum(int a, int b){
        return a + b;
    }

    float sum(float a, float b){
        return a + b;
    }

    float sum(int a, int b, int c){
        return a + b + c;
    }
}
