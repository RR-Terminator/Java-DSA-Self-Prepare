//package Arrays;
//
//import java.util.ArrayList;
//import java.util.Stack;
//
//public class MakeTheArrayBeautiful {
//    public static void main(String[] args) {
//        int [] arr = {4,1,-1,1};
//        System.out.println(makeBeautiful(arr));
//    }
//    public static ArrayList<Integer> makeBeautiful(int[] arr) {
//        ArrayList<Integer> ans = new  ArrayList<>();
//        Stack<Integer> stack = new Stack<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (!stack.isEmpty() && stack.top >= 0 && arr[i] >=0) {
//                stack.push(arr[i]);
//            }
//            else{
//
//            }
//        }
//
//        }
//        return ans;
//
//}
