package Stacks;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

        System.out.println(isValid("(){}[]["));

    }

    public static boolean isValid(String str){

        Stack <Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{'|| str.charAt(i)=='('|| str.charAt(i) == '[') {
                stack.push(str.charAt(i));
            }
            else{
                if ((stack.peek() == '{' && str.charAt(i) == '}' ) ||
                        (stack.peek() == '[' && str.charAt(i) == ']' ) ||
                        (stack.peek() == '(' && str.charAt(i) == ')' )  ) {

                    stack.pop();

                }
                else {
                    return false;
                }
            }

        }

        return stack.isEmpty();


    }
}
