package com.threaddynamics.chp4.dishant;

public class BinaryTree<E> {

    Node<E> root;
    

    public void printInOrder(Node<E> node) {
        if(node == null){
            return;
        }
        
        printInOrder(node.left);
        System.out.print(node.data + " ");
        printInOrder(node.right);
    }

    public void printPreOrder(Node<E> node) {
        if(node == null){
            return;
        }
        System.out.print(node.data + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    public void printPostOrder(Node<E> node) {
        if(node == null){
            return;
        }
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.data + " ");
    }

    static class Node<E> {
        Node<E> left, right;

        E data;

        public Node(E data ,Node<E> left, Node<E> right) {
            this.left = left;
            this.right = right;
            this.data = data;
        }
    }
    
    public static void main(String[] args) {
        final BinaryTree<Integer> binaryTree = new BinaryTree<>();
        binaryTree.root = new Node<Integer>(1, null, null);
        binaryTree.root.left = new Node<Integer>(2, null, null);
        binaryTree.root.right = new Node<Integer>(3, null, null);
        
        binaryTree.root.left.left = new Node<Integer>(4, null, null);
        binaryTree.root.left.right = new Node<Integer>(5, null, null);
        
        System.out.println("**IN ORDER TRAVERSAL**");
        binaryTree.printInOrder(binaryTree.root);
        
        System.out.println("\n");
        
        System.out.println("**PRE ORDER TRAVERSAL**");
        binaryTree.printPreOrder(binaryTree.root);
        
        System.out.println("\n");
        
        
        System.out.println("**POST ORDER TRAVERSAL**");
        binaryTree.printPostOrder(binaryTree.root);
        
        System.out.println("\n");
    }

}
