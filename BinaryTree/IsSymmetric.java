package BinaryTree;

import com.sun.source.tree.Tree;

public class IsSymmetric {
    public static void main(String[] args) {
        IsSymmetric test = new IsSymmetric();
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(2);
        System.out.print(test.isSymmetric(root.right,root.left));
    }

    public boolean isSymmetric(TreeNode right, TreeNode left) {
        if (right == null && left ==null) {
            return true;
        }
        if (right == null || left == null) {
            return false;
        }
        if (right.key != left.key) {
            return false;
        }
        return isSymmetric(right.right,left.left) && isSymmetric(right.left, left.right);

        

    }
}
