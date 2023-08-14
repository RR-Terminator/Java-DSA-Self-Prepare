package PattenPrinting;



public class PalindromicPattern {
    public static void main(String[] args) {
       ToPrint( 5);


    }
    public static void ToPrint(int n){
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n-i ; j++) {

                System.out.print("   ");
            }
            // descending
            for (int j = i; j >=1 ; j--) {
                System.out.print(j + " ");
            }
            // ascending
            for (int j = 2; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static int smallestValue(int n) {


        while (n > 1) {
            int prime = getSmallestPrimeFactor(n);
            n /= prime;
            n += prime;
        }
        return n;
    }

    private static int getSmallestPrimeFactor(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return i;
            }
        }
        return n;
    }

}
