package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class MaxAreaInHistogram {
    public static void main(String[] args) {

        int [] arr = {6,2,5,4};
        System.out.println(maxArea(arr));

    }

    public static int maxArea(int [] arr){
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

//        System.out.println(Arrays.toString(nextSmallerRight));
//        System.out.println(Arrays.toString(nextSmallerLeft));

        for (int i = 0; i < arr.length; i++) {

            int height = arr[i];

            int width = nextSmallerRight[i] - nextSmallerLeft[i] -1 ;

            int currentArea = height * width ;

            max = Math.max(max, currentArea);

        }
   return max;
    }
}
