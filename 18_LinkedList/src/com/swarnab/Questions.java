package com.swarnab;

public class Questions {

    // Reverse the Linked List
    // https://leetcode.com/problems/reverse-linked-list/description/
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

    // Merge Two Sorted Lists
    // https://leetcode.com/problems/merge-two-sorted-lists/
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode temp = head;

        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                temp.next = new ListNode(list1.val);
                list1 = list1.next;
                temp = temp.next;
            } else {
                temp.next = new ListNode(list2.val);
                list2 = list2.next;
                temp = temp.next;
            }
        }

        while(list1 != null) {
            temp.next = new ListNode(list1.val);
            list1 = list1.next;
            temp = temp.next;
        }

        while(list2 != null) {
            temp.next = new ListNode(list2.val);
            list2 = list2.next;
            temp = temp.next;
        }

        return head.next;
    }

    // Find the Middle Node
    // https://leetcode.com/problems/middle-of-the-linked-list/
    public ListNode middleNode(ListNode head) {
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if(prev != null) {
            prev.next = null;
        }

        return slow;
    }

    // Merge Sort in Linked Lists
    // https://leetcode.com/problems/sort-list/
    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null)
            return head;

        ListNode middle = middleNode(head);
        ListNode left = sortList(head);
        ListNode right = sortList(middle);

        return mergeTwoLists(left, right);
    }

    //

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
