package Stacks;

import java.util.Stack;

public class CelebrityProblem {
    public static void main(String[] args) {

        int [] [] arr = {   {0,1,0},
                                {0,0,0},
                                {0,1,0}};


        System.out.print(find(arr));

    }

     public static int find(int[][] matrix){
        int n = matrix.length;


        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }

        while(stack.size() >1){
            int a = stack.peek();
            stack.pop();
            int b = stack.peek();
            stack.pop();
            if(knows(matrix,a,b)){
                stack.push(b);
            }
            else stack.push(a);
        }
         int temp = stack.peek();
        int zeroCount = 0;
        boolean zero = false;
        for (int i = 0; i < n; i++) {
            if (matrix[temp][i] == 0) {
                zeroCount++;
            }
        }
        if (zeroCount == n) {
            zero = true;
        }

        int oneCount = 0;
        boolean one = false;

         for (int[] ints : matrix) {
             if (ints[temp] == 1) {
                 oneCount++;
             }
         }
        if (oneCount == n-1) {
            one = true;
        }

        if (one && zero) {
            return temp;
        }

        else return -1;


    }

    private static boolean knows(int[][] matrix, int a, int b) {
        return matrix[a][b] == 1;
    }

}
