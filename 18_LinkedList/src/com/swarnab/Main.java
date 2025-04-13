package com.swarnab;

public class Main {
    public static void main(String[] args) {
        LL node = new LL();
        // node.insertLast(17);
//        node.insertFirst(18);
//        node.insertFirst(12);
//        node.insertFirst(8);
//        node.insertFirst(9);
//        node.insertFirst(5);
//        node.insertFirst(3);
//        // node.display();
//
//        node.insert(7, 3);
//        node.display();

//        node.insertRec(90, 3);
//        node.display();
//        System.out.println(node.deleteFirst());
//        node.display();

//        System.out.println(node.deleteLast());
//        node.display();

//        System.out.println(node.delete(2));
//        node.display();
//        // System.out.println(node.getSize());
//        int valuetoSearch = 7;
//        int index = node.search(valuetoSearch);
//        if(index == -1) {
//            System.out.println("Element not found in List");
//        }
//        else {
//            System.out.println("Element found at index " + index);
//        }
//
//        DLL list = new DLL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(99);
//        list.insert(8, 65);
//
//        list.display();

        // Questions Part
//        LL list = new LL();
//        list.insertFirst(4);
//        list.insertFirst(2);
//        list.insertFirst(2);
//        list.insertFirst(1);
//        list.insertFirst(1);
//        list.insertFirst(1);
//
//        list.display();
//        list.removeDuplicates();
//        list.display();

        // Merge two sorted lists
        LL list1 = new LL();
        list1.insertLast(1);
        list1.insertLast(3);
        list1.insertLast(5);
        // list1.display();

        LL list2 = new LL();
        list2.insertLast(1);
        list2.insertLast(2);
        list2.insertLast(3);
        list2.insertLast(14);
        // list2.display();

        LL ans = LL.merge(list1, list2);

        // ans.display();
    }
}