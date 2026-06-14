package com.example.leet75.linkedlist;

import java.util.ArrayDeque;
import java.util.Deque;

public class twinSum {
    public int pairSum(ListNode head) {
        Deque<ListNode>stack = new ArrayDeque<>();
        ListNode slow=head, fast = head;
        while(fast.next!=null){
            stack.push(slow);
            slow=slow.next;
            fast=fast.next.next;
        }
        int maxSum=0;
        while(slow!=null){
            int val = stack.pop().val;
            maxSum = Math.max(maxSum, val+slow.val);
            slow=slow.next;
        }
        return maxSum;
    }
}
