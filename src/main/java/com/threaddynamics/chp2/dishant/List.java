package com.threaddynamics.chp2.dishant;

public class List<E> {

    private Node<E> first;

    private Node<E> last;

    public int size() {
        int counter = 1;
        Node<E> selecedNode = first;
        while (true) {
            if (selecedNode.next == null) {
                return counter;
            }
            selecedNode = selecedNode.next;
            counter++;
        }
    }

    public String toString() {
        Node<E> selectedNode = first;
        final StringBuffer stringBuffer = new StringBuffer();
        int counter = 0;
        while (true) {
            if (counter == 0) {
                stringBuffer.append("[");
            } else {
                stringBuffer.append(",");
            }

            if (selectedNode == null) {
                stringBuffer.append("]");
            }
            stringBuffer.append(selectedNode.item);
            selectedNode = selectedNode.next;
            if (selectedNode == null) {
                stringBuffer.append("]");
                break;
            }
            counter++;
        }
        return stringBuffer.toString();
    }

    public void add(E item) {
        if (first == null) {
            final Node<E> node = new Node<E>(null, null, item);
            first = node;
            last = node;
        } else {
            final Node<E> node = new Node<E>(null, null, item);
            node.prev = last;
            node.next = null;
            last.next = node;
            last = node;
        }
    }

    public void remove(int index) {
        Node<E> selectedNode = first;
        int counter = 0;
        while (true) {
            if (selectedNode == null) {
                break;
            }

            if (counter == index) {
                if (selectedNode.next == null) {
                    if (counter == 0) {
                        first = null;
                        last = null;
                    }else{
                        last = selectedNode.prev;
                        selectedNode.prev.next = null;
                    }
                } else {
                    selectedNode.next.prev = selectedNode.prev;
                    selectedNode.prev.next = selectedNode.next;
                    if (counter == 0) {
                        first = selectedNode;
                    }
                }
                break;
            }
            selectedNode = selectedNode.next;
            counter++;
        }
    }

    public E get(int index) {
        if (index == 0) {
            return first.item;
        }
        int counter = 1;
        Node<E> next = first;
        while (true) {
            next = next.next;
            if (next == null) {
                return null;
            }
            if (counter == index) {
                return next.item;
            }
            counter++;
        }
    }

    static class Node<E> {

        Node<E> prev;

        Node<E> next;

        E item;

        public Node(Node<E> prev, Node<E> next, E item) {
            this.prev = prev;
            this.next = next;
            this.item = item;
        }
    }

}
