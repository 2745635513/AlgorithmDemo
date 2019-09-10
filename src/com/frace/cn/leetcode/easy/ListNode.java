package com.frace.cn.leetcode.easy;

/**
 * Created by frace on 2019/9/10 14:11
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }

    /**
     * 默认构造器
     */
    public ListNode() {

    }

    /**
     * 添加节点
     */
    ListNode head =null;
    public void addNode(int d) {
        ListNode newNode = new ListNode(d);// 实例化一个节点
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = newNode;
    }
}
