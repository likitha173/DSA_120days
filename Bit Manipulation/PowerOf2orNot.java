public class PowerOf2orNot {
    public static void main(String args[]){
        int n = 8;

        if((n & (n-1)) == 0){
            System.out.println(n + " is power of 2");
        } else {
            System.out.println(n + " is NOT power of 2");
        }
    }
}
