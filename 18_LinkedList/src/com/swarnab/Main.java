package com.swarnab;

public class Main {
    public static void main(String[] args) {
        LL node = new LL();
        // node.insertLast(17);
        node.insertFirst(18);
        node.insertFirst(12);
        node.insertFirst(8);
        node.insertFirst(9);
        node.insertFirst(5);
        node.insertFirst(3);
        // node.display();

        node.insert(7, 3);
        node.display();

//        System.out.println(node.deleteFirst());
//        node.display();

//        System.out.println(node.deleteLast());
//        node.display();

        System.out.println(node.delete(2));
        node.display();
        // System.out.println(node.getSize());
        int valuetoSearch = 7;
        int index = node.search(valuetoSearch);
        if(index == -1) {
            System.out.println("Element not found in List");
        }
        else {
            System.out.println("Element found at index " + index);
        }
    }
}