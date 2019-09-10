package com.frace.cn.leetcode.easy;

/**
 * Created by frace on 2019/9/10 13:49
 */
public class isSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        if(root1.val != root2.val) return false;
        return isSymmetric(root1.right, root2.left) && isSymmetric(root1.left, root2.right);
    }

    public static void main(String[] args) {
//        System.out.println(isSymmetric());
    }

    /**
     * Definition for a binary tree node.
     */


}
