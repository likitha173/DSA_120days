public class FindSubsets {
    public static void Subsets(String str, String subset, int i){
        if(i == str.length()){
            if(subset.length() == 0){
                System.out.println("null-subset");
            } else{
                System.out.println(subset);
            }
            return;
        }
        Subsets(str, subset + str.charAt(i), i+1); //yes
        Subsets(str, subset, i+1); //No
    }
    public static void  main(String args[]){
        String str = "abc";
        Subsets(str, "", 0);
    }
}