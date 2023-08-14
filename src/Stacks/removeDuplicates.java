package Stacks;

import java.util.Stack;


public class removeDuplicates {
    public static void main(String[] args) {

        System.out.println(removePair("abbaaccd"));

    }

    public static String removePair(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();


        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!st.isEmpty() && st.peek() == ch) st.pop();
            else st.push(ch);
        }

        if (st.isEmpty()) return "-1";
        while (!st.isEmpty()) ans.insert(0, st.pop());
        return ans.toString();


    }
}