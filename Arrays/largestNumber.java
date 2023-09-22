public class largestNumber {
    public static int getLargestNum(int numbers[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static int getSmallestNum(int numbers[]){
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args){
        int numbers[] = {3, 6, -6, 8, -14, 0, 1, 4};


        System.out.println("Largest value in the given Array: " + getLargestNum(numbers));
        System.out.println("Smallest value in the given Array: " + getSmallestNum(numbers));

    }
    
}
