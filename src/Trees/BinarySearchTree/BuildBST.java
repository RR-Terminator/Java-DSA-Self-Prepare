package Trees.BinarySearchTree;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuildBST {

    public static Node BuildTree(Node root, int val) {
        if (root == null) {

            root = new Node(val);
            return root;
        }

        if (val < root.data) root.left = BuildTree(root.left, val);
        else root.right = BuildTree(root.right, val);
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node node, int val) {
        if (node == null) return false;
        if (node.data == val) {
            return true;
        }
        if (node.data > val) return search(node.left, val);
        else return search(node.right, val);
    }

    public static Node DeleteNode(Node node, int key) {
        if (node == null) return null;

        if (key < node.data) node.left = DeleteNode(node.left, key);
        else if (key > node.data) node.right = DeleteNode(node.right, key);

        else {
            if (node.left == null) return node.right;
            if (node.right == null) return node.left;
            else {
                node.data = minValue(node.right);
                node.right = DeleteNode(node.right, node.data);
            }
        }

        return node;
    }


    // Delete a Node in BST:-

    private static int minValue(Node right) {
        int minval = right.data;
        while (right.left != null) {
            minval = right.left.data;
            right = right.left;
        }
        return minval;
    }

    public static Node deleteNode(Node root, int key) {
        if (root == null) return null;
        if (key < root.data) root.left = deleteNode(root.left, key);
        else if (key > root.data) root.right = deleteNode(root.right, key);
        else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            root.data = maxElement(root.right);
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }

    public static int maxElement(Node root) {
        while (root.left != null) {
            root.data = root.left.data;
        }
        return root.data;
    }

    public static void printLeafPath(Node node, ArrayList<Integer> list) {
        if (node == null) return;

        list.add(node.data);
        if (node.left == null && node.right == null) {
            printlist(list);
        }
        printLeafPath(node.left, list);
        printLeafPath(node.right, list);
        list.remove(list.size() - 1);

    }


    // Printing Root To Leaf In BST:-

    private static void printlist(ArrayList<Integer> list) {

        for (int element : list) {
            System.out.print(element + " ->");
        }
        System.out.println("Null");

    }

    public static void main(String[] args) {
        int[] values = {8,5,3,1,4,6,10,11,14};
        Node node = null;

        for (int element : values) {
            node = BuildTree(node, element);
        }
        ArrayList<Integer> list = new ArrayList<>();
        // System.out.println( printLeafPath(node));
        printLeafPath(node, list);

    }

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

}
