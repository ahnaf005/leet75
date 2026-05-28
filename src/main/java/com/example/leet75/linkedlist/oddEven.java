package com.example.leet75.linkedlist;

public class oddEven {
    public ListNode oddEvenList(ListNode head) {
        ListNode oddHead = new ListNode();
        ListNode evenHead = new ListNode();
        ListNode odd = oddHead;
        ListNode even = evenHead;
        ListNode cur = head;
        boolean isOdd = true;
        while(cur!=null){
            if(isOdd){
                odd.next=cur;
                odd=odd.next;
            }else{
                even.next=cur;
                even=even.next;
            }
            cur=cur.next;
            isOdd = !isOdd;
        }
        even.next=null;
        odd.next=evenHead.next;
        return oddHead.next;
    }
}
