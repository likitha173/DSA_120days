public class pairsOfAarry {
    public static void printPairsOfAarry(int numbers[]){
        int totalPair = 0;
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j] + ") ");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println("Total Pair of Array: " + totalPair);
    }
    public static void main(String[] args){
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        printPairsOfAarry(numbers);
    }
}
