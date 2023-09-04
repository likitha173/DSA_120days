public class functionOverloading{

/*
    // Overloading using Parameters
    public static int sum(int a, int b){
        return a + b;
    }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    public static void main(String arg[]){
        System.out.println(sum(3, 5));
        System.out.println(sum(5, 4, 1));
    }
*/
    
     // using Data Types 

    public static int sum(int a, int b){
        return a + b;
    }
    public static float sum(float a, float b){
        return a + b;
    }
    public static void main(String arg[]){
        System.out.println(sum(3, 5));
        System.out.println(sum(5.2f, 4.6f));
    }

}   
