public class LastOccurence {
    public static int lastOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        
        int isFound = lastOccurence(arr, key, i+1);

        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String args[]){
        int arr[] = {8, 2, 5, 8, 3, 6, 5, 1};
        int key = 5;
        System.out.println(lastOccurence(arr, key, 0));
    }
}
