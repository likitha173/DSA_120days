public class PrintXpowN_Ologn {
    public static int optimizedPower(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPower(x, n/2);
        int halfPowSq = halfPower * halfPower;

        if(n%2 != 0){
            halfPowSq = x * halfPowSq;
        }
        return halfPowSq;
    }
    public static void main(String args[]){
        System.out.println(optimizedPower(2, 10));
    }
}
