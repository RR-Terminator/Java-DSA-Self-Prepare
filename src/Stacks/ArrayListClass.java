package Stacks;

import java.util.ArrayList;
import java.util.Stack;

// Stacks Using ArrayList;
public class ArrayListClass {
    static ArrayList<Integer> list = new ArrayList<>();

    // Checking if the list is Empty or Not
    static boolean isEmpty(){
        return list.size()==0;
    }

    // Pushing Elements in Stack
   public static void push(int n){
        list.add(n);
    }

   public static int pop(){
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }

    public  static int peek(){
        return list.get(list.size()-1);
    }

    public static void main(String[] args) {

        ArrayListClass stack = new ArrayListClass();
        push(1);
        push(2);
        stack.push(3);
       while(!stack.isEmpty()){
           System.out.println(stack.peek());
           pop();



       }


    }

}
