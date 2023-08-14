package Arrays;

import java.util.HashSet;

public class CheckTwoArraysAreSimilar {
    public static void main(String[] args) {

    }

    public static boolean check(long [] A,long [] B,int N)
    {

        HashSet<Long> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(A[i]);
        }

        for (int i = 0; i < N; i++) {
            if(!set.contains(B[i])) return false;
        }
        return true;


    }
}
