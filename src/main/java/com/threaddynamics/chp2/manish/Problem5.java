package com.threaddynamics.chp2.manish;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {

		Node first = null;

		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.println("Provide first Linked list data number of record:");
		int n = scanner.nextInt();
		System.out.println("Enter linked list element");
		for (int i = 0; i < n; i++) {
			num = scanner.nextInt();
			if (first == null)
				first = new Node(num);
			else
				first.appendToTail(num);
		}
		System.out.println("Provide Last record point element index:");
		int index = scanner.nextInt();
		Node ref = first;
		Node indexNode = null;
		while (true) {
			index--;
			if (index == 0)
				indexNode = ref;

			if (ref.getNext() == null) {
				ref.setNext(indexNode);
				break;
			} else
				ref = ref.getNext();
		}
		scanner.close();
		List<Node> list = new ArrayList<Node>();
		// boolean found = false;
		while (true) {
			if (list.contains(first)) {
				System.out.println("element is: " + first.getData());
				break;
			} else {
				list.add(first);
				first = first.getNext();
		}
		}
	}

}
