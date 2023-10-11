public class ClearLastithBit {
    public static void main(String args[]){
        int n = 15;
        int i = 2;
        int bitMask = (~0)<<i;
        
        System.out.println(n & bitMask);
    }    
}
