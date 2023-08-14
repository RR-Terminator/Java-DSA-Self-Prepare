package Recursion;

public class FriendsPairing {
    public static void main(String[] args) {
        System.out.println(pairingWays(4));
    }

    public static int pairingWays(int n){
        if (n == 1 || n==2) {
            return n;
        }
        return pairingWays(n-1)+(n-1)*pairingWays(n-2);
    }
}
