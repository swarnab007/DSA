package com.swarnab;
import java.util.*;

public class Traversals {
    // Preorder Traversal
    public static void preOrder(Node node) {
        // Base Case
        if(node == null)
            return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // Inorder Traversal
    public static void inOrder(Node node) {
        // Base Case
        if(node == null)
            return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    // Postorder Traversal -> storing in a List
    public static void postOrder(Node node, List<Integer> ans) {
        // Base Case
        if(node == null)
            return;
        postOrder(node.left, ans);
        postOrder(node.right, ans);
        ans.add(node.data);
    }

    // Level Order Traversal
    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
            return ans;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> subList = new ArrayList<>();

            for(int i=0; i<size; i++) {
                Node node = queue.peek();
                queue.remove();

                if(node.left != null)
                    queue.add(node.left);

                if(node.right != null)
                    queue.add(node.right);

                subList.add(node.data);
            }
            ans.add(subList);
        }
        return ans;
    }


    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print("Preorder Traversal of the Tree is : ");
        preOrder(root);
        System.out.println();

        System.out.print("Inorder Traversal of the Tree is : ");
        inOrder(root);
        System.out.println();

        List<Integer> ans = new ArrayList<>();
        System.out.print("Postorder Traversal of the Tree is : ");
        postOrder(root, ans);
        for(int i : ans) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Levelorder Traversal of the Tree is : " + levelOrder(root));
    }
}
