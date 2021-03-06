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
		Node node = first;
		while (node != null) {
			while (node.getNext() != null) {
				if (node.getData() == node.getNext().getData()) {
					node.setNext(node.getNext());
				}
			}
		}
	}
}

