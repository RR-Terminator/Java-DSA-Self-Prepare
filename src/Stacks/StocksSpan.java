package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class StocksSpan {
    public static void main(String[] args) {

        int[] stock = {100, 80, 60, 70, 60, 85, 100};
        int[] span = new int[stock.length];
        stockSpan(stock, span);
        System.out.println(Arrays.toString(span));

    }

    public static void stockSpan(int[] stock, int[] span) {
        Stack<Integer> stack = new Stack<>();

        span[0] = 1;
        stack.push(0);

        for (int i = 1; i < stock.length; i++) {
            int curr = stock[i];
            while (!stack.isEmpty() && curr > stock[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }
            stack.push(i);
        }
    }
}
