import java.util.ArrayList;
import java.util.Collections;

public class Sort_ArrayList {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(8);
        list.add(3);

        System.out.println(list);
        Collections.sort(list); // Ascending
        System.out.println(list);

        //Descending
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
