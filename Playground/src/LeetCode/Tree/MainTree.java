package LeetCode.Tree;

import java.util.ArrayList;
import java.util.List;

public class MainTree {
    public static void main(String[]args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        // Tree
        //       1
        //     2   3
        //    4 5

        List<Integer> list = inOrderTraversal(root);
        System.out.print("InOrder Traversal is " + list);
    }

    public static List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }

    public static void helper(TreeNode root, List<Integer> list){
        if (root == null)
            return;

        if (root.left!=null)
            helper(root.left, list);

        list.add(root.val);

        if (root.right !=null)
            helper(root.right, list);
    }
}
