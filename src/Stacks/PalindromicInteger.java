package Stacks;

import java.util.Stack;

public class PalindromicInteger {
    public static void main(String[] args) {

        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        if(x<0) return false;

        int num = x;

        Stack<Integer> stack = new Stack<>();
        while(x!=0){
            int digit = x%10;
            stack.push(digit);
            x = x/10;
        }

        int rev = 0;

        while(!stack.isEmpty()){
            rev= rev*10 + stack.pop();
        }

        return rev==num;

    }
}
