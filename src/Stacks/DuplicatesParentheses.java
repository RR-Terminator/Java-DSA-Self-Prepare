package Stacks;

import java.util.Stack;

public class DuplicatesParentheses {
    public static void main(String[] args) {
        System.out.println(isDuplicate("(x+y*(a-b))"));
    }

    public static boolean isDuplicate(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')') {
                int cout = 0;
                while (stack.peek() != '('){
                    cout++;
                    stack.pop();
                }
                if (cout < 1) {
                    return true;
                }
                else{
                    stack.pop();
                }
            }
            else{
                stack.push(str.charAt(i));
            }
        }
        return false;
    }
}
