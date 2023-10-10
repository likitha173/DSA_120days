public class UpdateithBit {
    public static void main(String[] args){
        int n = 10;
        int i = 2;
        int newBit = 1;
        
        int clearBit = n & (~(1<<i));
        
        int bitMask = newBit<<i;
        System.out.println(n | bitMask);
    }
}
