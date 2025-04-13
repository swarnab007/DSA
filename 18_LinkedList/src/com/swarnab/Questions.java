package com.swarnab;

import java.util.List;

public class Questions {

    public static ListNode reverse(ListNode head) {
        if(head == null) {
            return null;
        }

        ListNode prev = null;
        ListNode temp = head;
        ListNode curr = head.next;

        while(temp != null) {
            temp.next = prev;
            prev = temp;
            temp = curr;
            curr = curr.next;
        }
        head = prev;
        return head;
    }

    class ListNode {
        int val;
        ListNode next;

        public ListNode() {

        }

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
