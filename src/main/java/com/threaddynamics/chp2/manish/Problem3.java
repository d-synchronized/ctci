package com.threaddynamics.chp2.manish;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {

		Node first = null;

		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.println("Provide Linked list data number of record:");
		int n = scanner.nextInt();
		System.out.println("Enter linked list element");
		for (int i = 0; i < n; i++) {
			num = scanner.nextInt();
			if (first == null)
				first = new Node(num);
			else
				first.appendToTail(num);
		}
		scanner.close();
		Node second = null;
		while (first != null) {
			if (second == null)
				second = first;
			else
				second = second.getNext();
			first = first.getNext() == null ? null : first.getNext().getNext();
		}
		System.out.println(second.getData());

	}

}
