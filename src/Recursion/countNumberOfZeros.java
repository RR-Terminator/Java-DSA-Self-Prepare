package Recursion;

public class countNumberOfZeros {
    public static void main(String[] args) {
        System.out.println(count(1234,0));
    }
    static int count(int n , int sum){
        if (n==0) {
            return sum;
        }
               // int rem = n%10;
        if (n%10 == 0) {
            return count(n/10,sum+1);
        }
        return count(n/10,sum);
    }
}
