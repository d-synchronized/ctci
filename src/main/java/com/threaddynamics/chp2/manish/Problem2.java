package com.threaddynamics.chp2.manish;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Node first = null;

		Scanner scanner = new Scanner(System.in);
		int num;
		Node last;
		System.out.println("Provide nth:");
		int nth = scanner.nextInt();
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
		Node node = first;
		Node nNode = null;
		while (node != null) {
			if (nth == 0) {
				if(nNode ==null)
					nNode = first;
				else
					nNode = nNode.getNext();
			} else
				nth--;
			node = node.getNext();
		}
		System.out.println(nNode.getData());
	}

}
