package com.example.leet75.linkedlist;

public class middleNode {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null) return null;
        ListNode dummy = new ListNode();
        dummy.next=head;
        int count = 0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        ListNode prev = dummy;
        temp = head;
        for(int i=0;i<count/2;i++){
            temp=temp.next;
            prev=prev.next;
        }
        prev.next=temp.next;
        return dummy.next;
    }
}
