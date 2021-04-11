package BinaryTree;
public class IsBalanced {
    public static void main (String[] args) {
        IsBalanced test = new IsBalanced();
        TreeNode root = new TreeNode (8);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(0);
        root.right = new TreeNode(10);
        System.out.print(test.isBalanced(root));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);

    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}
