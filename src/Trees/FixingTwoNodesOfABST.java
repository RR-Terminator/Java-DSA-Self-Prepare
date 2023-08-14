package Trees;

import Trees.BinarySearchTree.BuildBST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FixingTwoNodesOfABST {
    public static void main(String[] args) {

    }

    public static Node correctBST(Node root) {

        ArrayList<Integer> list   = new ArrayList<>();
        SortedBST(root, list);
        Collections.sort(list);
        return BuildTree(list);


    }


    static int idx = -1;

    private static Node BuildTree(ArrayList<Integer> list) {
        idx++;
        if (list.get(idx) == null) {
            return null;
        }
        Node newNode = new Node(list.get(idx));
        newNode.left = BuildTree(list);
        newNode.right = BuildTree(list);
        return newNode;

    }

    private static void SortedBST(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }

        SortedBST(root.left,list);
        list.add(root.data);
        SortedBST(root.right, list);
    }


}
