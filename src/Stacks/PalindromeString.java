package Stacks;

// Checking the String is Palindrome or Not using Stack
// For a String abaXaba X is the mid-Point of the String
// Check if the Given String is Palindrome or not.

import java.util.Stack;

public class PalindromeString {


    public static void main(String[] args) {

        System.out.println(isPalindrome("aba"));
    }

    public static boolean isPalindrome(String str){

        Stack<Character> stack = new Stack<>();
        int index = 0;
        while(index < str.length() && str.charAt(index) != 'X'){
            char ch = str.charAt(index);
                stack.push(ch);
            index++;
        }
        index +=1;

        while(index < str.length() && !stack.isEmpty()){

            if (str.charAt(index) == stack.peek()) {
                stack.pop();
                index++;
            }
            else return false;
        }
        return stack.isEmpty();



    }



}
