package com.frace.cn.leetcode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by frace on 2019/9/11 9:49
 */
public class levelOrderBottom {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        /**
         * 返回二叉树的自下向上的节点值
         */
        LinkedList<List<Integer>> result = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> nodes = new ArrayList<>();
            int count = queue.size();//返回一层的数据
            for (int i=0;i<count;i++){
                TreeNode currentNode = queue.poll();//检索并删除头部,返回队列的头部
                nodes.add(currentNode.val);
                if (currentNode.left != null) queue.add(currentNode.left);//当当前节点有左孩子，添加到循环中
                if (currentNode.right !=null) queue.add(currentNode.right);//同理
            }
            result.addFirst(nodes);
        }
        return result;
    }
}
