package Recursion;

public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(12304));
        System.out.println(multi(12304));
    }
    static int sum(int n){
        if (n == 0) {
            return 0;
        }
        return n%10 + sum(n/10);
    }
    static int multi(int n){
        if (n == 0) {
            return 1;
        }
        return n%10 * multi(n/10);
    }

}
