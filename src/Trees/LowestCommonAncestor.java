package Trees;

import java.util.*;

public class LowestCommonAncestor {

    public static Node getLCA(Node node, int n1, int n2) {

        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getpath(node, n1, path1);
        getpath(node, n2, path2);

        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }

        return path1.get(i - 1);

    }

    private static boolean getpath(Node node, int n, ArrayList<Node> path) {
        if (node == null) {
            return false;
        }

        path.add(node);
        if (node.data == n) {
            return true;
        }

        boolean leftPart = getpath(node.Left, n, path);
        boolean rightPArt = getpath(node.Right, n, path);

        if (rightPArt || leftPart) {
            return true;
        }

        path.remove(path.size() - 1);
        return false;

    }

    public static Node getLAC2(Node node, int n1, int n2) {


        if (node == null || node.data == n1 || node.data == n2) {
            return node;
        }

        Node leftPart = getLAC2(node.Left, n1, n2);
        Node rightPart = getLAC2(node.Right, n1, n2);

        if (rightPart == null) {
            return leftPart;
        }
        if (leftPart == null) {
            return rightPart;
        }

        return node;

    }

    // Lowest Common Ancestor Using Recursion

    public static int KthAncestor(Node node, int n, int k) {

        if (node == null) {
            return -1;
        }

        if (node.data == n) {
            return 0;
        }

        int leftPart = KthAncestor(node.Left, n, k);
        int rightPart = KthAncestor(node.Right, n, k);

        if (rightPart == -1 && leftPart == -1) {
            return -1;
        }

        int max = Math.max(leftPart, rightPart);
        if (max + 1 == k) {
            System.out.print(node.data);
        }
        return max + 1;


    }

    // Print the Kth SmallestAncestor
// Zig zag Traversal of the Binary Tree
    static List<List<Integer>> zigzagTraversal(Node node) {
        List<List<Integer>> list = new ArrayList<>();

        if (node == null) {
            return list;
        }
        ArrayList<Integer> smallAns = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        // Adding First Element in the Queue With null;
        queue.add(node);
        queue.add(null);

        boolean left = true;

        while (!queue.isEmpty()) {
            Node curr = queue.remove();
            if (curr == null) {
                if (queue.isEmpty()) {
                    if (left) {
                        list.add(smallAns);
                    } else {
                        Collections.reverse(smallAns);
                        list.add(smallAns);
                    }

                    break;
                } else {
                    if (left) {
                        list.add(smallAns);
                        left = false;
                    } else {
                        Collections.reverse(smallAns);
                        list.add(smallAns);
                        left = true;
                    }

                    smallAns = new ArrayList<>();
                    queue.add(null);
                }

            } else {
                smallAns.add(curr.data);
                if (curr.Left != null) {
                    queue.add(curr.Left);
                }
                if (curr.Right != null) {
                    queue.add(curr.Right);
                }
            }
        }

        return list;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.Left = new Node(2);
        root.Right = new Node(3);
        root.Left.Left = new Node(4);
        root.Left.Right = new Node(5);
        root.Right.Right = new Node(6);
          root.Right.Right.Left = new Node(7);

        //System.out.print(getLAC2(root, 4, 5).data);
        // KthAncestor(root, 4, 2);
       // System.out.println(zigzagTraversal(root));
        System.out.println(levelOrder(root));


    }


    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> SmallAns = new ArrayList<>();

        Queue <Node> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);

        while(!q.isEmpty()){
            Node curr = q.poll();
            if(curr == null){
                if(q.isEmpty()){
                    list.add(SmallAns);
                    break;
                }
                else{
                    list.add(SmallAns);
                    SmallAns = new ArrayList<>();
                    q.offer(null);
                }
            }
            else{
                SmallAns.add(curr.data);
                if(curr.Left != null ) q.offer(curr.Left);
                if(curr.Right != null ) q.offer(curr.Right);
            }
        }
        return list;
    }

    public static class Node {
        int data;
        Node Left;
        Node Right;

        public Node(int data) {
            this.data = data;
            this.Left = null;
            this.Right = null;
        }
    }


}
