package Stacks;

import java.util.Stack;

public class RemoveKNumbers {
    public static void main(String[] args) {

        System.out.println(removeKdigits("1432219", 3));

    }

    public static String removeKdigits(String num, int k) {
        if (k == 0) {
            return num;
        }

        int len = num.length();
        if (k == len) return "0";

        Stack<Character> stack = new Stack<>();

        int idx = 0;

        while (idx < len) {
            if (!stack.isEmpty() && stack.peek() > num.charAt(idx) && k > 0) {
                stack.pop();
                k--;
            } else {
                stack.push(num.charAt(idx));
                idx++;
            }

        }

        while (k > 0) {
            stack.pop();
            k--;
        }

        String ans = "";

        while (!stack.isEmpty()) ans = stack.pop() + ans;

        while (ans.length() > 1 && ans.charAt(0) == '0')
            ans = ans.substring(1);

        return ans;


    }
}
