package Recursion;

public class TilingProblem {
    public static void main(String[] args) {
        System.out.println(ways(3));
    }
    public static int ways(int n){
        if (n == 0||n== 1) {
            return 1;
        }
        int vertical = ways(n-1);
        int horizontal = ways(n-2);
        return horizontal+vertical;

    }
}
