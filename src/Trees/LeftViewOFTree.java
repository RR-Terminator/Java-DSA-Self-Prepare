package Trees;

import java.util.ArrayList;
import java.util.Arrays;

public class LeftViewOFTree {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void LeftView(Node node) {
        ArrayList<Node> list = new ArrayList<>();
        LeftViewHelper(node, list, 0);
        for (Node curr : list) {
            System.out.print(curr.data + " ");
        }

    }


    private static void LeftViewHelper(Node node, ArrayList<Node> list, int level) {

        if (node == null) {
            return;
        }


        // Refer Note

        if (list.size() == level) {
            list.add(node);
        }

        // Here To Print the Left Side of the Tree We Need To Hence  to do
        //Pre Order Traversal

        LeftViewHelper(node.left, list, level + 1);
        LeftViewHelper(node.right, list, level + 1);


        /*
         To Print the Right Side View  Of the Tree instead Of Pre Order Traversal
         Travel the Right Side rather Than visiting The Left Side;
          LeftViewHelper(node.right, list, level + 1);
         LeftViewHelper(node.left, list, level + 1);
        */


    }


    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.right.left = new Node(7);

        LeftView(root);

        

    }
}
