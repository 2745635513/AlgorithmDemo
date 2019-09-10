package com.frace.cn.leetcode.easy;

import java.util.*;

public class MergeTwoLists {
    /**
     * 设计思路：
     * 头部为0
     * 定义一个节点
     * 判断当前的节点，节点指向小的值，改变小值所在的链表的节点
     *
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return head.next;
    }

    /**
     * 采用递归的方式(把重复的去掉的，不符合题目要求)
     *是算法题 删除重复的算法的解题思路
     */
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2){
       if (l1 == null) return l2;
       if (l2==null) return l1;
       if (l1.val <l2.val){
           l1.next = mergeTwoLists2(l1.next,l2);
           return l1;
       }else {
           l2.next = mergeTwoLists2(l1,l2.next);
           return l2;
       }
    }

    public static void main(String[] args) {
        MergeTwoLists test = new MergeTwoLists();
        ListNode mergeTwoLists = new ListNode();
        mergeTwoLists.addNode(1);
        mergeTwoLists.addNode(2);
        mergeTwoLists.addNode(4);
        ListNode l = new ListNode();
        l.addNode(1);
        l.addNode(3);
        l.addNode(5);
        l.addNode(6);
        test.mergeTwoLists(mergeTwoLists.head,l.head);

    }

}
