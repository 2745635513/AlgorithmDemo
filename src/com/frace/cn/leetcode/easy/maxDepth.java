package com.frace.cn.leetcode.easy;

/**
 * Created by frace on 2019/9/10 14:17
 */
public class maxDepth {
    /**
     * 算法：当他没有子节点时表示是叶子节点
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        return root ==null ? 0 :Math.max( maxDepth(root.left),maxDepth(root.right))+1;
    }
}
