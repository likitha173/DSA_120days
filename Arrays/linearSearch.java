public class linearSearch {
    public static int linear_Search(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {2, 3, 6, 5, 4, 7, 8, 9};
        int key = 7;

        int index = linear_Search(numbers, key);
        if(index == -1){
            System.out.println("NO FOUND");
        }else{
            System.out.println("Key is at index: " + index);
        }
    }
}
