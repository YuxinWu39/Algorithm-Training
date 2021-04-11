package BinaryTree;// Name: Yuxin Wu (Peter Wu)

import com.sun.source.tree.Tree;// VUnetID: wuy45
// Email: yuxin.wu@vanderbilt.edu
// Class: CS 1101 - Vanderbilt University
// Section: 02 (TR Singh)
//
// Program description: This program is designed to output the interstate highway numbers.
// Date: 25th Sep
// Honor statement: I have neither given nor received any unauthorized aid on this assignment.
;
public class getHeight {
    public static void main(String[] args){
        getHeight test = new getHeight();
        TreeNode root = new TreeNode (8);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(0);
        System.out.print(test.height(root));

    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}
