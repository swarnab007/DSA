package com.swarnab;

public class LL {
    // variables
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    // insertion at First
    public void insertFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

        // if there was no element or a single element
        if(tail == null) {
            tail = head;
        }
        size++;
    }

    // insertion at Last
    public void insertLast(int val) {

        // if there is no element
        if(tail == null) {
            insertFirst(val);
            return;
        }

        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
        tail.next = null;
        size++;
    }

    // insertion at given index
    public void insert(int val, int index) {
        if(index == 0)
            insertFirst(val);
        if(index == size)
            insertLast(val);

        Node temp = head;
        // reach to the previous node of the index
        for (int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(val, temp.next);
        temp.next = newNode;

        size++;
    }

    // Recursive insertion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node) {
        if(index == 0) {
            Node newNode = new Node(val, node.next);
            size++;
            return newNode;
        }
        node.next = insertRec(val, index-1, node.next);
        return node;
    }

    // Deletion At First
    public int deleteFirst() {
        if(head == null) {
            tail = null;
            return -1;
        }
        int val = head.value;
        head = head.next;
        size--;
        return val;
    }

    // Deletion at Last
    public int deleteLast() {
        if(size <= 1) {
            return deleteFirst();
        }
        // Get the previous node of tail
        Node secondLastNode = get(size - 1);
        int val = tail.value;
        tail = secondLastNode;
        tail.next = null;
        size--;

        return val;
    }

    // deletion at an index
    public int delete(int index) {
        if(index == size) {
            return deleteLast();
        }
        if(index == 0) {
            return deleteFirst();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;

        return val;
    }

    // get a Node through index
    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // search a value and return the index
    public int search(int val) {
        Node tenp = head;
        int index = 0;
        while (tenp != null) {
            if(tenp.value == val)
                return index;
            tenp = tenp.next;
            index++;
        }
        return -1;
    }

    // Display Linked List
    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    // https://leetcode.com/problems/remove-duplicates-from-sorted-list/submissions/1560118674/
    // Sorted Linked List -> Remove the Duplicates
    public void removeDuplicates() {
        if(head == null)
            return;

        Node curr = head.next;
        Node prev = head;
        while(curr != null) {
            if(prev.value == curr.value) {
                prev.next = curr.next;
                curr = curr.next;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
    }

    // Node class
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


    // Merge two Sorted Lists
    // https://leetcode.com/problems/merge-two-sorted-lists/
    public static LL merge(LL first, LL second) {
        Node head1 = first.head;
        Node head2 = second.head;

        LL ans = new LL();

        while(head1 != null && head2 != null) {
            if(head1.value < head2.value) {
                ans.insertLast(head1.value);
                head1 = head1.next;
            } else {
                ans.insertLast(head2.value);
                head2 = head2.next;
            }
        }

        while(head1 != null) {
            ans.insertLast(head1.value);
            head1 = head1.next;
        }

        while(head2 != null) {
            ans.insertLast(head2.value);
            head2 = head2.next;
        }

        return ans;
    }

    // https://leetcode.com/problems/happy-number/
    // Happy Number
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSqaureSum(slow);
            fast = findSqaureSum(findSqaureSum(fast));
        } while (slow != fast);
        if(slow == 1)
            return true;
        else
            return false;
    }

    public static int findSqaureSum(int num) {
        int n = num;
        int sum = 0;
        while(n != 0) {
            int digit = n % 10;
            sum += (int) Math.pow(digit, 2);
            n = n / 10;
        }
        return sum;
    }

}