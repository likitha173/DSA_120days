public class SubStrings {
    public static String subString(String str, int si, int ei){
        String subStr = "";
        for(int i=si; i<ei; i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String args[]){
        String str = "HelloWorld";
        str.substring(0, 5);
        System.out.println(str.substring(0, 5));
        System.out.println(subString(str, 0, 5));
    }
}
