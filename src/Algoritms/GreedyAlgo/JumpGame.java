package Algoritms.GreedyAlgo;

import java.util.Scanner;

public class JumpGame {

    public static void main(String[] args) {
      Print(5);

    }

    public static boolean canJump(int[] nums) {
        int ReachablePosition = 0;
        for (int i = 0; i < nums.length; i++) {
            if (ReachablePosition < i) {
                return false;
            }
            ReachablePosition = Math.max(ReachablePosition, i + nums[i]);
        }
        return true;
    }


    static void Print(int n) {
        int i, j;

        for (i = -n/2; i <= n/2; i++) {
            for (j = -n / 2; j <= n / 2; j++) {
                if (Math.abs(i) + Math.abs(j) < n / 2) {
                    System.out.print(" ");
                } else System.out.print(" * ");
            }
            System.out.println();
        }
}

}
