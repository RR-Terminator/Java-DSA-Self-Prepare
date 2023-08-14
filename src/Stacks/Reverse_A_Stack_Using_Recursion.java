package Stacks;

import java.util.Stack;

public class Reverse_A_Stack_Using_Recursion {
    // Reverse A Stack using Recursion

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        reverseStack(stack);
    }

    public static void insertbottom(Stack<Integer> stack, int element) {

        if(stack.isEmpty()){
            stack.push(element);
            return;
        }

        int temp = stack.peek();
        stack.pop();
        insertbottom(stack , element);
        stack.push(temp);


    }

    public static void reverseStack(Stack<Integer> stack) {
        if(stack.isEmpty()){
            return;
        }
        int temp = stack.peek();
        stack.pop();
        reverseStack(stack);
        insertbottom(stack , temp);

    }


}
