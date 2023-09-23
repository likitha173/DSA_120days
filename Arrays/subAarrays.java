public class subAarrays {
    public static void printSubArrays(int numbers[]){
        int n = numbers.length;
        int totalSubArrays = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
                totalSubArrays++;
            }
            System.out.println();
        }
        System.out.println("Total Sub Arrays: " + totalSubArrays);
    }
    public static void main(String[] args){
        int numbers[] = {2, 4, 6, 8, 10};

        printSubArrays(numbers);
    }
}
