public class FriendsPairing {
    public static int friendPairing(int n){
        if(n==1 || n==2){
            return n;
        }

        int totalWays = friendPairing(n-1) + (n-1) * friendPairing(n-2);
        return totalWays;
    }
    public static void main(String args[]){
        System.out.println(friendPairing(3));
    }
}
