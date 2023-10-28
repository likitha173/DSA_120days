import java.util.ArrayList;

public class PairSum12P {
    public static boolean pairSum1(ArrayList<Integer> list, int target){
        int lp = 0;
        int rp = list.size()-1;

        while(lp < rp){
            // case 1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }

            // case 1
            if(list.get(lp) + list.get(rp) < target){
                lp++;
            } else {
                // case 1
                rp--;
            }
        }
        return false;
    }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(pairSum1(list, 5));

    }
}
