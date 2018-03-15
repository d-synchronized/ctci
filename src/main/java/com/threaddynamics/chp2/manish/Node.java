package com.threaddynamics.chp2.manish;

public class Node {
	Node next = null;
	int data;

	public Node(int d) {
		data = d;
	}

	void appendToTail(int d) {

		Node end = new Node(d);

		Node n = this;

		while (n.next != null) {
			n = n.next;
		}

		n.next = end;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}
