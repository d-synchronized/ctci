package com.threaddynamics.chp2.dishant;

public class LinkedList<E> {

    public Node<E> head;

}

class Node<E> {
    Node<E> next;

    E data;

    public Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;
    }
}
