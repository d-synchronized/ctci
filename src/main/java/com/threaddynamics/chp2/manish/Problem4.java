package com.threaddynamics.chp2.manish;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {

		Node first = null;
		Node second = null;

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
		System.out.println("Provide Second Linked list data number of record:");
		n = scanner.nextInt();
		System.out.println("Enter linked list element");
		for (int i = 0; i < n; i++) {
			num = scanner.nextInt();
			if (second == null)
				second = new Node(num);
			else
				second.appendToTail(num);
		}
		Node third = null;
		int carry = 0;
		while (first != null || second != null) {
			int sum = (first != null ? first.getData() : 0) + (second != null ? second.getData() : 0) + carry;
			carry = sum > 9 ? 1 : 0;
			if (third == null)
				third = new Node(sum % 10);
			else
				third.appendToTail(sum % 10);
			
			if(first!=null)
				first = first.getNext();
			if(second!=null)
				second = second.getNext();
		
			if(first==null &&second==null && carry==1)
				third.appendToTail(1);
		}
		System.out.println("Third Linked list data:");
		while(third!=null)
		{
			System.out.println(third.getData());
			third=third.getNext();
		}	
		
	}
}
