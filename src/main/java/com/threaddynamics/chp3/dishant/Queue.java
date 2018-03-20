package com.threaddynamics.chp3.dishant;

public class Queue<E> {

    Node<E> first, last;

    public void add(E data) {
        final Node<E> node = new Node<E>(data, null);
        if (last == null) {
            last = node;
            first = last;
        } else {
            last.next = node;
            last = node;
        }
    }

    public String toString() {
        Node<E> ptr = first;
        final StringBuilder stringBuilder = new StringBuilder();
        boolean initialize = false;
        while (ptr != null) {
            if (!initialize) {
                stringBuilder.append("[");
                initialize = true;
            }
            stringBuilder.append(ptr.data);
            if (ptr.next == null) {
                stringBuilder.append("]");
            } else {
                stringBuilder.append(",");
            }
            ptr = ptr.next;
        }
        return stringBuilder.toString();
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
        final Queue<Integer> queue = new Queue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        
        System.out.println(queue);
    }

}
