package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class maxSumOfTreeAtLevel {
    public static void main(String[] args) {

    }

    public static int maxLevelSum(Node root) {
        int sum = Integer.MIN_VALUE;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        int curr_sum = 0 ;
        while (!queue.isEmpty()){
            Node curr = queue.poll();
            if (curr == null) {
                if (queue.isEmpty()) {
                    break;
                }
                else {
                    queue.offer(null);
                    
                    sum = Math.max(sum, curr_sum);
                    curr_sum=0;
                }
            }
            else {
                curr_sum += curr.data;
                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
        }
        return sum;

    }



static class Node{
    int data;
    Node left,right;
    public  Node(int d){
        data=d;
        left=right=null;
    }
}
}
