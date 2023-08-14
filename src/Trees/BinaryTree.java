package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import static Trees.BinaryTree.BinaryTreeStruct.Preorder;

public class BinaryTree {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, 7, -1, -1, 6, -1, -1};
        BinaryTreeStruct tree = new BinaryTreeStruct();
        Node root = tree.BuildTree(arr);
        // System.out.println(root.data);

        tree.preorder(root);
        System.out.println();
//        tree.inorder(root);
//        System.out.println();
//        tree.postorder(root);
//
//        System.out.println();
//        tree.levelOrder(root);
//
//        int max = tree.FindMax(root);
//        System.out.println(max);

        System.out.println(Preorder(root));


    }

    // Constructing the Binary Tree using  Recursion

    // node Class oF the Binary Tree
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }


    }

    static class BinaryTreeStruct {

        static int idx = -1;

        public static Node BuildTree(int[] arr) {
            idx++;
            if (arr[idx] == -1) {
                return null;
            }

            Node newNode = new Node(arr[idx]);
            newNode.left = BuildTree(arr);
            newNode.right = BuildTree(arr);

            return newNode;

        }

        // Time Complexity O(n)
        public static void preorder(Node node) {

            if (node == null) {
                // System.out.print(-1 + " ");
                return;
            }

            System.out.print(node.data + " " + " ,");
            preorder(node.left);
            preorder(node.right);

        }

        // Inorder Traversal of the Tree
        // Time Complexity O(n):-

        public static void inorder(Node node) {

            if (node == null) {
                return;
            }
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }


        // Pre-Order Traversal Of the Tree
        // time Complexity : O(n)

        public static void postorder(Node node) {

            // Base Case :-

            if (node == null) {
                return;
            }
            preorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " " + ",");
        }

        //Level Order Traversal
        // Time complexity : - O(n)

        public static void levelOrder(Node node) {
            if (node == null) {
                return;
            }

            Queue<Node> queue = new LinkedList<>();
            queue.add(node);
            queue.add(null);

            while (!queue.isEmpty()) {
                Node currNode = queue.remove();
                if (currNode == null) {
                    System.out.println();
                    if (queue.isEmpty()) {
                        break;
                    } else queue.add(null);
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        queue.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        queue.add(currNode.right);
                    }
                }

            }

        }

        // Finding The Largest Element in the Binary Tree
        // Time complexity :- 0(n)
        // Use the Level Order Transversal

        public static int FindMax(Node node) {
            if (node == null) {
                return Integer.MIN_VALUE;
            }

            int ans = Integer.MIN_VALUE;

            Queue<Node> q = new LinkedList<>();
            q.offer(node);
            q.offer(null);

            while (!q.isEmpty()) {
                Node currNode = q.poll();
                if (currNode == null) {
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.offer(null);
                    }
                } else {
                    ans = Math.max(ans, currNode.data);
                    if (currNode.left != null) {
                        q.offer(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.offer(currNode.right);
                    }
                }
            }
            return ans;

        }


        // Iterative Approach of Pre Order Traversal
        // Time Complexity O(n)  :-

        public static ArrayList<Integer> Preorder(Node root) {
            ArrayList<Integer> list = new ArrayList<>();
            if (root == null) {
                return list;
            }
            Stack<Node> stack = new Stack<>();
            stack.add(root);
            while (!stack.isEmpty()) {
                Node curr = stack.pop();
                list.add(curr.data);
                if (curr.right != null) {
                    stack.add(curr.right);
                }
                if (curr.left != null) {
                    stack.add(curr.left);
                }
            }
            return list;
        }


        public static ArrayList<Integer> Inorder(Node root) {
            ArrayList<Integer> list = new ArrayList<>();
            if (root == null) {
                return list;
            }

            Stack<Node> stack = new Stack<>();
            Node node = root;
            while (true) {
                if (node != null) {
                    stack.push(node);
                    node = node.left;
                } else {
                    if (stack.isEmpty()) {
                        break;
                    }
                    node = stack.pop();
                    list.add(node.data);
                    node = node.right;
                }
            }
            return list;

        }


    }


}


