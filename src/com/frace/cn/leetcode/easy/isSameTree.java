package com.frace.cn.leetcode.easy;

/**
 * Created by frace on 2019/9/6 14:47
 */
public class isSameTree {
    /**
     * 比较两个树是否相同
     *
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p ==null && q==null){
            return true;
        }
        if (p != null && q != null && q.val == p.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;


    }

}

