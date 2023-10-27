import java.util.ArrayList;

public class MaxElement {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
    
        list.add(7);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(12);

        int max = Integer.MIN_VALUE;

        for(int i=0; i<list.size(); i++){
            if(max < list.get(i)){
                max = list.get(i);
            }
        }
        System.out.println("Max Element in ArrayList: " + max);
    }
}