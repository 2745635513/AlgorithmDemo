package com.frace.cn.leetcode.easy;

/**
 * Created by frace on 2019/9/12 9:54
 */
public class isBalanced {
    static boolean flag=true;
    public static boolean isBalanced(TreeNode root) {
        postSearch(root);
        return flag;
    }
    public static int postSearch(TreeNode root){
        if(root==null||!flag) return 0;
        int left=postSearch(root.left);
        int right=postSearch(root.right);
        if(Math.abs(left-right)>1) flag=false;
        return Math.max(left,right)+1;
    }
}
