public class FastExponentiation {
    public static void main(String args[]){
        int n = 5;
        int a = 3;
        int ans = 1;

        if (n == 0) {
            System.out.println(1);
        }

        if (n < 0) {
            a = 1 / a;
            n = -n;
        }

        while(n > 0){
            if((n & 1) != 0){
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        System.out.println(ans);
    }
}
