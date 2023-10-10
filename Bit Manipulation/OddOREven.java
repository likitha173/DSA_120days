public class OddOREven {
    public static void OddOrEven(int n){
        int bitMask = 1;

        if((n & bitMask) == 0){
            //even
            System.out.println(n + " is Even");
        } else{
            System.out.println(n + " is odd");
        }
    }
    public static void main(String[] args){
        OddOrEven(3);
        OddOrEven(11);
        OddOrEven(14);
    }    
}
