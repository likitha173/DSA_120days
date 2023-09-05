public class primeInRange{
    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void primeNumsInRange(int bw){
        for(int i=2; i<=bw; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]){
        primeNumsInRange(20);
    }
}