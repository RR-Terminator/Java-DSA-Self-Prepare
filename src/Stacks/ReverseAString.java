package Stacks;

import java.util.Stack;

public class ReverseAString {

    public static void main(String[] args) {

       String ans =  reverse("HelloWorld");
       System.out.println(ans);

       System.out.println(reverse(ans));

    }

    public static String reverse(String str){

        Stack <Character> stack = new Stack<>();

        int index = 0;
        while (index < str.length()){
            stack.push(str.charAt(index));
            index++;
        }

        StringBuilder result = new StringBuilder("");

        while(!stack.isEmpty()){
            char ch = stack.pop();
            result.append(ch);
        }
        return result.toString();

    }
}
