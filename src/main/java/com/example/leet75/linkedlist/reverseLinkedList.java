package com.example.leet75.linkedlist;

public class reverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode newHead = head.next;
        ListNode prev = head;
        while(newHead.next !=null){
            ListNode temp = newHead.next;
            newHead.next=prev;
            prev=newHead;
            newHead=temp;
        }
        newHead.next=prev;
        head.next=null;
        return newHead;
    }
}
