package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementInRight {

    public static void main(String[] args) {

        int [] arr ={6,8,0,1,3,2};
        System.out.println(Arrays.toString(findGreaterRight(arr)));
        System.out.println(Arrays.toString(findSmallerRight(arr)));
        System.out.println(Arrays.toString(findGreaterLeft(arr)));
        System.out.println(Arrays.toString(findSmallerLeft(arr)));

    }

    public static int [] findGreaterRight(int [] arr){

         Stack<Integer> stack = new Stack<>();

        int [] ans = new int[arr.length];

        for (int i = arr.length-1; i >=0 ; i--) {
            while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]){
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = -1 ;
            }
            else{
                ans[i] = arr[stack.peek()];
            }
            stack.push(i);
        }
        return ans;
    }


    // Similar Question :-
    // next smaller right
    public static int [] findSmallerRight(int [] arr){

        Stack<Integer> stack = new Stack<>();

        int [] ans = new int[arr.length];

        for (int i = arr.length-1; i >=0 ; i--) {
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]){
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = -1 ;
            }
            else{
                ans[i] = arr[stack.peek()];
            }
            stack.push(i);
        }
        return ans;
    }

    // next Greater left

    public static int [] findGreaterLeft(int [] arr){

        Stack<Integer> stack = new Stack<>();

        int [] ans = new int[arr.length];

        for (int i = 0; i < arr.length-1; i++) {
            while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]){
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = -1 ;
            }
            else{
                ans[i] = arr[stack.peek()];
            }
            stack.push(i);
        }
        return ans;
    }


    // next smaller left


    public static int [] findSmallerLeft(int [] arr){

        Stack<Integer> stack = new Stack<>();

        int [] ans = new int[arr.length];

        for (int i = 0; i <arr.length ; i++) {
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]){
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = -1 ;
            }
            else{
                ans[i] = arr[stack.peek()];
            }
            stack.push(i);
        }
        return ans;
    }

}
