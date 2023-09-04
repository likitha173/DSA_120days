import java.util.*;

public class functionWithParameters{
    public static int sumOf2Nums(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sumOf2Nums(a, b);
        System.out.println("Sum is : " + sum);
    }
}