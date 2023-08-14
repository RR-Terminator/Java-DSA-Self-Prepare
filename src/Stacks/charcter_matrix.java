package Stacks;

import java.util.Stack;

public class charcter_matrix {
    public static void main(String[] args) {
        char [] [] arr = {
                {'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}
        };
        System.out.println(maximalRectangle(arr));


    }

    public static int maximalRectangle(char[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        int[] heights = new int[n];

        int ans = Integer.MIN_VALUE;

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                heights[j] = matrix[i][j] == '1' ? heights[j] + 1: 0;
            }
            ans = Math.max(ans, maxAreaHistogram(heights, n));
        }

        return ans;

    }

    public static int maxAreaHistogram(int [] arr, int n){
        int max = 0;
        int [] nextSmallerRight = new int[arr.length];
        int [] nextSmallerLeft = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length-1; i >=0; i--) {

            while(!stack.isEmpty() && arr[i] <= arr[stack.peek()]){
                stack.pop();
            }

            if(stack.isEmpty()){
                nextSmallerRight[i] = arr.length;
            }
            else{
                nextSmallerRight[i] = stack.peek();
            }

            stack.push(i);

        }

        stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]){
                stack.pop();
            }
            if (stack.isEmpty()) {
                nextSmallerLeft[i] = -1;
            }
            else {
                nextSmallerLeft [i]  = stack.peek();
            }
            stack.push(i);
        }
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nextSmallerRight[i] - nextSmallerLeft[i] -1 ;
            int currentArea = height * width ;
            max = Math.max(max, currentArea);
        }
        return max;
    }
}
