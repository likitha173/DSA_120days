public class FactorialN {
    public static void main(String args[]){
        int n = 5;
        System.out.println(factN(n));
    }
    public static int factN(int n){
        if(n == 0){
            return 1;
        }

        int fnm1 = factN(n-1);
        int fn = n * factN(n-1);
        return fn; 
    } 
}
