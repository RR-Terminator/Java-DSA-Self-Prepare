package Stacks;

import java.util.Stack;

public class RemovingStarsFromAString {
    public static void main(String[] args) {

        System.out.println(removeStars("leet**cod*e"));

    }

    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '*') {
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }

        return stringBuilder.reverse().toString();
    }
}
