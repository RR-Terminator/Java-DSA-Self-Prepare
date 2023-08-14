package Stacks;

import java.util.Stack;

public class bracketReversal {
    public static void main(String[] args) {
        System.out.println(countBracketReversals("{{{}}}}"));
    }

    public static int countBracketReversals(String input) {

        if (input.length()%2 != 0) {
            return -1;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '{') {
                stack.push(input.charAt(i));
            } else {
                if (stack.isEmpty() || stack.peek() == '}') {
                    stack.push(input.charAt(i));
                } else stack.pop();
            }

        }

        int count = 0;

        while (!stack.isEmpty()) {

            char c1 = stack.pop();
            char c2 = stack.pop();

            if (c2 == c1) {
                count++;
            } else count += 2;
        }

        return count;


    }
}
