public class PrintXpowN_Ologn {
    public static int optimizedPower(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfPowSq = optimizedPower(x, n/2) * optimizedPower(x, n/2);

        if(n%2 != 0){
            halfPowSq = x * halfPowSq;
        }
        return halfPowSq;
    }
    public static void main(String args[]){
        System.out.println(optimizedPower(2, 10));
    }
}
