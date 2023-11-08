import java.util.*;

public class ChocalaProblem {
    public static void main(String args[]) {
        // int n = 4, m = 6;
        Integer costVer[] = {2, 1, 3, 1, 4}; //m-1
        Integer costHor[] = {4, 1, 2}; //n-1

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int hc = 0, vc = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while (hc < costHor.length && vc < costVer.length) {
            if (costVer[vc] <= costHor[hc]) {
                cost += (costHor[hc] * vp);
                hp++;
                hc++;
            } else {
                cost += (costVer[vc] * hp);
                vp++;
                vc++;
            }
        }
        while (hc < costHor.length) {
            cost += (costHor[hc] * vp);
            hp++;
            hc++;
        }
        while (vc < costVer.length) {
            cost += (costVer[vc] * hp);
            vp++;
            vc++;
        }

        System.out.println("Min cost of cut: " + cost);
    }
}