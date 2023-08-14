package Stacks;

import java.util.Stack;

// Follow-up  Question of max Area in Histogram


public class Max_Area_Rectangle_In_binaryMatrix {
    public static void main(String[] args) {

        int [] [] arr = {
                {0,1,1,0},
                {1,1,1,1},
                {1,1,1,1        },
                {1,1,0,0},
        };
        System.out.println(maxArea(arr));

    }

    public static int maxArea(int [][] arr){
        int max = 0;
        int n = arr.length;
        int m = arr[0].length;
        int []  ans = new int[arr[0].length];

        for (int j = 0; j < m; j++) {
            ans[j] = arr[0][j];

        }
        max = maxAreaHistogram(ans);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] == 0){
                    ans[j] = 0;
                }
                else{
                    ans[j] = ans[j] + arr[i][j];
                }

            }
            max = Math.max(max,maxAreaHistogram(ans));
        }
        
        return max;
    }

    public static int maxAreaHistogram(int [] arr){
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
