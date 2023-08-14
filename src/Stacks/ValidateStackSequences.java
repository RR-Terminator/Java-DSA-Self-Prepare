package Stacks;

import java.util.Stack;

public class ValidateStackSequences {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {4,5,3,2,1};
        System.out.println(validateStackSequences(arr1,arr2) );
    }


    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        int N = popped.length;
        Stack<Integer> stack = new Stack<>();


        int j = 0;

        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[j]   && j< popped.length){
                stack.pop();
                j++;
            }
        }



       return N==j ;

    }

}
