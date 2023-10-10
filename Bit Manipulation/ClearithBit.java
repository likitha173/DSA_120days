public class ClearithBit {
    public static void main(String[] args){
        int n = 10;
        int i = 1;
        int bitMask = ~(1<<i);

        System.out.println(n & bitMask);
    }    
}
