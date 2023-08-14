package Stacks;

import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        System.out.println(longestValidParentheses(")()())"));
    }

    public static int longestValidParentheses(String str) {


        int ans = Integer.MIN_VALUE;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        while(!stack.isEmpty() && stack.size() >1){
            char a = stack.peek();
            stack.pop();
            char b = stack.peek();
            stack.pop();
            if(a== ')' && b== '('){
                ans+=2;
            }
            else break;
        }
        return  ans;
    }
}
