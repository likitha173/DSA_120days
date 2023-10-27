import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // Operations on ArrayList

        //Add Element
        list.add(7); // O(1)
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(12);

        list.add(1, 9); // O(n)
        System.out.println(list);

        //Get Operation - O(1)
        int element = list.get(2);
        System.out.println(element);

        // Delete Operation - O(n)
        list.remove(2);
        System.out.println(list);

        // Set Operation - O(n)
        list.set(2, 25);
        System.out.println(list);

        //Contains Operation - O(n)
        System.out.println(list.contains(2));
        System.out.println(list.contains(20));



        // .size()
        System.out.println(list.size());

        //print arrayList
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

    }
}
