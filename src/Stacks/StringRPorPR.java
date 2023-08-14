package Stacks;

import java.util.Stack;

public class StringRPorPR {
    public static void main(String[] args) {
        System.out.println((solve(6,8,"orzprqrd")));
    }

    static long solve(int X,int Y, String S)
    {

      int count_pr = 0;
      int count_rp=0;
        Stack<Character> stack = new  Stack<>();

        for (int i = 0; i < S.length(); i++) {
            if (!stack.isEmpty()) {
                if (stack.peek() == 'r' && S.charAt(i) == 'p'){
                    count_rp++;
                    stack.pop();
                    continue;
                }
                if (stack.peek() == 'p' && S.charAt(i) == 'r') {
                    count_pr++;
                    stack.pop();
                    continue;
                }
            }

                if ( S.charAt(i)=='p') {
                    stack.push(S.charAt(i));
                }
                if ( S.charAt(i)=='r') {
                    stack.push(S.charAt(i));
                }



        }

      return (long) count_pr *X+ (long) count_rp *Y;
    }
}
