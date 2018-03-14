package com.threaddynamics.chp2.manish;

import java.util.Scanner;

public class DeleteDuplicateNodeLinkedList {

	public static void main(String[] args) {
		Node first = null;
		System.out.println("Provide Linked list data number of record:");
		Scanner scanner = new Scanner(System.in);
		int num;
		Node last;
		int n = scanner.nextInt();
		System.out.println("Enter linked list element");
		for (int i = 0; i < n; i++) {
			num = scanner.nextInt();
			if (first == null)
				first = new Node(num);
			else
				first.appendToTail(num);

			System.out.println(num);
		}
		scanner.close();
		Node previous = null;
		Node node = first;
		while (node != null) {
			boolean found = false;
			Node next = node.getNext();
			while (next != null) {
				if (node.getData() == next.getData()) {
					node.setNext(next.getNext());
					found = true;
				}
			}
			if(previous == null && found)
			{
				//first = n
			}	
			previous = node;
			node = node.getNext();
			if (found)
				previous.setNext(node);

		}
	}
}

class Node {
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
