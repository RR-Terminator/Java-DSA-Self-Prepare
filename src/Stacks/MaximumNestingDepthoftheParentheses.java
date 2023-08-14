package Stacks;

import java.util.Stack;

public class MaximumNestingDepthoftheParentheses {
    public static void main(String[] args) {

        System.out.println(maxDepth("(1)+((2))+(((3)))"));

    }

    public static int maxDepth(String s){
        int res = 0 ;
        int current = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
                current++;
                res = Math.max(res,current);
            }
            if (!stack.isEmpty() && stack.peek() == '(' && s.charAt(i) == ')') {
                stack.pop();
                current--;
            }


        }
        return res;
        
    }

}
