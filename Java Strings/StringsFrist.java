import java.util.Scanner;
public class StringsFrist {
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
    public static void main(String[] args){
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz");

        // Strings are IMMUTABLE

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        System.out.println(name);

        String fullName = "Likitha Khatri";
        System.out.println(fullName.length());

        // concatenation
        String firstName = "Likitha";
        String lastName = "Khatri";

        System.out.println(firstName + " " + lastName);

        System.out.println(fullName.charAt(0));

        printLetters(fullName);
    }
}
