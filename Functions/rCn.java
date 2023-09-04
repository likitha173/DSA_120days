import java.util.*;
public class rCn{
    public static int factorial(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f * i;
        }
        return f;
    }
    public static int calucate_rCn(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nMr = factorial(n-r);

        int calucate_rCn = (fact_n / (fact_r * fact_nMr));
        return calucate_rCn;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(calucate_rCn(n, r));
    }
}