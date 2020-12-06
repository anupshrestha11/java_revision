package InvertBinaryTree;

import java.util.ArrayList;
import java.util.List;

public class InvertBinaryTree {

    private static final int COUNT = 5;

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.val = x;
        }

        @Override
        public String toString() {
            return val + " ";
        }
    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);

        root.left = right;
        root.right = left;

        return root;
    }


    static void print2DUtil(TreeNode root, int space) {
        if (root == null)
            return;
        space += COUNT;
        print2DUtil(root.left, space);

//        System.out.print("\n");
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.val + "\n");
        print2DUtil(root.right, space);

    }

    static void print2D(TreeNode root) {
        print2DUtil(root, 0);
    }





    public static void main(String[] args) {
        // * root node
        TreeNode root = new TreeNode(1);

        // * 2nd level
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        // * 3rd level
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);



        System.out.println("Given Binary Tree");
        print2D(root);
        root = invertTree(root);
        System.out.println("-----------------------------------------------");
        System.out.println("Inverted Binary Tree");
        print2D(root);
    }


}
