package Trees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopView {

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

    public static class Info {
        Node node;
        int hd;

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {

        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0;
        int max = 0;
        q.add(new Info(root, 0));
        q.add(null);
        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else q.add(null);
            } else {
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }
                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }
                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }


        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }


    }


    // Bottom View Of the Tree Use The Same Concept Of the Top View of the
    // Binary tree But Instead Of Checking If the Tree HD is Present In Hash Map But
    // Update all The Values.

    public static void BottomView(Node node) {

        Queue<Info> queue = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0;
        int max = 0;

        queue.add(new Info(node, 0));
        while (!queue.isEmpty()) {
            Info curr = queue.poll();

            map.put(curr.hd, curr.node);
            if (curr.node.left != null) {
                queue.add(new Info(curr.node.left, curr.hd + 1));
                min = Math.min(min, curr.hd-1);
            }
            if (curr.node.right != null) {
                queue.add(new Info(curr.node.right, curr.hd + 1));
                max = Math.max(max , curr.hd+1);
            }

        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data);
        }


    }

    public static void KthLevel(Node node, int level, int k) {
        if (node == null) {
            return;
        }
        if (level == k) {
            System.out.print(node.data + " ");
            return;
        }
        KthLevel(node.left, level + 1, k);
        KthLevel(node.right, level + 1, k);
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        root.right.right.left = new Node(7);

        //topView(root);
        //KthLevel(root, 1, 4);
        BottomView(root);


    }


}
