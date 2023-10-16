public class print10to1 {
    public static void main(String[] args){
        int n = 10;
        printDecNums(n);
    }

    public static void printDecNums(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDecNums(n-1);
    }
}
