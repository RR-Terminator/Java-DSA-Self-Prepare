package Stacks;
import java.util.*;
public class PushAtBottom {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        pushAtBottom(stack,4);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

     static void pushAtBottom(Stack<Integer> stack, int i) {

        if (stack.isEmpty()) {
            stack.push(i);
            return;
        }
        int top = stack.pop();
        pushAtBottom(stack, i);
        stack.push(top);

    }


}
