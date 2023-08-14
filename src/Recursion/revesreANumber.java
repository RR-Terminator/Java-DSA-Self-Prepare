package Recursion;

public class revesreANumber {
    public static void main(String[] args) {
        System.out.println(reverese(1,0));

    }
    static int reverese(int n , int sum){
        //base case check
        if (n == 0) {
            return sum;
        }
        int rem  = n%10;
        int smallans = sum*10 +rem;
        return  reverese(n/10,smallans);

    }
}
