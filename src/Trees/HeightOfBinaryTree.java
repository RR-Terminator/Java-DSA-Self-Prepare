package Trees;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


// finding The Element In the Binary Tree Without using Recursion

// Find Using Level Order Traversal ;

class Info {
    int diameter;
    int height;

    public Info(int diameter, int height) {
        this.diameter = diameter;
        this.height = height;
    }
}

public class HeightOfBinaryTree {

    // Height Of the Binary Tree :-
    // TC :- O(N)
    public static int BinaryTreeHeight(Node node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = BinaryTreeHeight(node.left);
        int RightHeight = BinaryTreeHeight(node.right);

        return Math.max(leftHeight, RightHeight) + 1;

    }

    //  Number of nodes In the binary :-
    public static int NodeNumber(Node node) {
        if (node == null) {
            return 0;
        }
        int leftCount = NodeNumber(node.left);
        int rightCount = NodeNumber(node.right);
        return leftCount + rightCount + 1;
    }

    public static int SumOfNodes(Node node) {

        // Base Case :-

        if (node == null) {
            return 0;
        }
        int leftSum = SumOfNodes(node.left);
        int rightSum = SumOfNodes(node.right);

        return leftSum + rightSum + node.data;

    }

    // Sum of Nodes in the binary Tree:-
    // Time complexity : - O(N).

    public static int Diameter(Node node) {
        if (node == null) {
            return 0;
        }
        int leftDiameter = Diameter(node.left);
        int leftHeight = BinaryTreeHeight(node.left);
        int rightDiameter = Diameter(node.right);
        int rightHeight = Diameter(node.right);

        int self = leftHeight + rightHeight + 1;

        return Math.max(self, Math.max(leftDiameter, rightDiameter));

    }

    // Diameter of the Binary Tree
    // time Complexity O(n^2) as the diameter as well as the Height of the tree
    // is Calculated in the as O(n) Time is Required to  Calculate the Diameter  of the
    // binary tree
    // O(n) is Required for the calculation of the Height of the binary tree
    // total Time Complexity = O(n) * O(n) = O(n^ 2)...

    public static Info diameter(Node node) {

        if (node == null) {
            return new Info(0, 0);
        }

        Info left = diameter(node.left);
        Info right = diameter(node.right);

        int dia = Math.max(Math.max(left.diameter, right.diameter), left.height + right.height + 1);
        int ht = Math.max(left.height, right.height) + 1;
        return new Info(dia, ht);


    }


    // The Better way Of Approaching the Program is to Calculate the Diameter
    // and the Height at the Same Time For that We can create a Class which Take the Diameter
    // And The Height at the Same time
    // Hence Each Node Has Been Visited Only Once
    // Time Complexity is O(n).

    public static boolean isSubtree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);

    }

    private static boolean isIdentical(Node root, Node subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }

        if (root == null || subRoot == null || root.data != subRoot.data) {
            return false;
        }

        if (!isIdentical(root.left, subRoot.left)) {
            return false;
        }
        return isIdentical(root.right, subRoot.right);

    }


    // Find  Two Trees are Identical or not they are identical if and only  subtree
    // is present in a main tree


    // Algorithm to find the Node is Present in the Binary Tree
    // TC  / SC  :- O(n)
    public static boolean isPresent(Node node, int n) {
        if (node == null) {
            return false;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        queue.add(null);

        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            if (curr == null) {
                if (queue.isEmpty()) {
                    return false;
                } else queue.add(null);
            } else {
                if (curr.data == n) {
                    return true;
                } else {
                    if (curr.left != null) {
                        queue.add(curr.left);
                    }
                    if (curr.right != null) {
                        queue.add(curr.right);
                    }
                }
            }
        }
        return false;
    }


    // Finding The Max Element In The binary Tree
    // Recursive Approach
    //   Time Complexity  O(n)
    // Space Complexity O(n)

    public static int maxNumber(Node node) {
        if (node != null) {
            int leftMax = maxNumber(node.left);
            int rightMax = maxNumber(node.right);
            int selfMax = node.data;

            return Math.max(selfMax, Math.max(leftMax, rightMax));
        }

        return -1;

        // For Iterative Approach use the Level order Traversal
        // Time and Space Complexity is O(n)

    }

// Inserting the Node in The Binary Tree
    // TC :- O(N)

    public static void insertInBinaryTree(Node node, int data) {
        if (node == null) {
            node = new Node(data);
        }

        if (node.left == null) {
            node.left = new Node(data);
        }
        if (node.right == null) {
            node.right = new Node(data);
        }

        insertInBinaryTree(node.left, data);
        insertInBinaryTree(node.right, data);

    }

    public static void deleteRoot(Node node) {
        node = null;
    }

    // Calculate the Number of  Leaf nodes In The Binary Tree
    // TC  & SC = O(n)

    public static int numberOfLeaves(Node node) {
        if (node == null) {
            return 0;
        }
        int count = 0;

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node curr = queue.poll();

            if (curr.left == null && curr.right == null) {
                count++;
            }
            if (curr.left != null) {
                queue.offer(curr.left);
            }
            if (curr.right != null) {
                queue.offer(curr.right);
            }
        }
        return count;

    }

    /* Calculate the Number of Full Nodes int the Binary Tree
    // Tc / SC = O(n)
    */

    public static int fullNode(Node node) {
        if (node == null) {
            return 0;
        }
        int count = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            if (curr.left != null && curr.right != null) {
                count++;
            }
            if (curr.left != null) {
                queue.offer(curr.left);
            }
            if (curr.right != null) {
                queue.offer(curr.right);
            }
        }

        return count;
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.left = new Node(7);


        System.out.println(numberOfLeaves(root));
        System.out.println(fullNode(root));

//        System.out.println(BinaryTreeHeight(root));
//        System.out.println(NodeNumber(root));
//        System.out.println(SumOfNodes(root));
//        System.out.println(diameter(root).diameter);
//        System.out.println(Diameter(root));


//        Node subRoot = new Node(2);
//        subRoot.left = new Node(4);
//        subRoot.right  = new Node(5);
//        subRoot.right.right = new Node(7);

//        System.out.println(isSubtree(root,subRoot));
//        System.out.println(isPresent(root, 1));
        //    System.out.println(widthOfBinaryTree(root));

        //    System.out.println(maxNumber(root));

    }

}



