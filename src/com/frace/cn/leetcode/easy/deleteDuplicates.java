package com.frace.cn.leetcode.easy;

/**
 * Created by frace on 2019/9/6 10:10
 */
public class deleteDuplicates {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head ==null || head.next==null) return head;
        head.next=deleteDuplicates(head.next);
        if (head.val==head.next.val) head=head.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode=new ListNode();
        listNode.addNode(1);
        listNode.addNode(1);
        listNode.addNode(2);
        System.out.println(deleteDuplicates(listNode.head));
    }


}
