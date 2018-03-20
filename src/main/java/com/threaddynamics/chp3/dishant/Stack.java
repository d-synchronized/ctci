package com.threaddynamics.chp3.dishant;

public class Stack<E> {

    Node<E> head;

    public String toString() {
        final StringBuffer stringBuffer = new StringBuffer();
        Node<E> pointer = head;
        boolean initialized = false;
        while (pointer != null) {
            if (!initialized) {
                stringBuffer.append("[");
                initialized = true;
            }
            final E data = pointer.data;
            stringBuffer.append(data);
            if (pointer.next == null) {
                stringBuffer.append("]");
            } else {
                stringBuffer.append(",");
            }
            pointer = pointer.next;
        }
        return stringBuffer.toString();
    }

    public void add(E data) {
        final Node<E> node = new Node<>(data, null);
        node.next = head;
        head = node;
    }

    public E pop() {
        E data = null;
        if (head != null) {
            data = head.data;
            head = head.next;
        }
        return data;
    }

    static class Node<E> {

        E data;

        Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

    }

    public static void main(String[] args) {
        final Stack<Integer> stacks = new Stack<>();
        stacks.add(1);
        stacks.add(2);
        stacks.add(3);
        stacks.add(4);
        
        stacks.pop();
        
        System.out.println(stacks);
    }

}
