/* 
Question 2 : Write a method named isEven that accepts an int argument. The method
should return true if the argument is even, or false otherwise. Also write a program to test your
method.
 */ 

import java.util.*;
public class question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if(isEven(n)){
            System.out.println("Given number " + n + " is Even");

        }
        else{
            System.out.println("Given number " + n + " is Odd");

        }
    }

    public static boolean isEven(int n){
        if(n % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
