package com.threaddynamics.chp3.dishant;

import java.util.Stack;

/**
 * 
 * Implement a MyQueue class which implements a queue using two stacks
 * 
 **/
public class Problem5<E> {

    Stack<E> stack1 = new Stack<>();

    Stack<E> stack2 = new Stack<>();

    public void enqueue(E data) {
        stack1.add(data);
    }

    public E dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("***STACK EXHAUSTED***");
            return null;
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.add(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        final Problem5<Integer> problem5 = new Problem5<>();
        int counter = 1;
        problem5.enqueue(counter++);
        problem5.enqueue(counter++);
        problem5.enqueue(counter++);
        problem5.enqueue(counter++);
        problem5.enqueue(counter++);

        System.out.println(problem5.dequeue());
        System.out.println(problem5.dequeue());
        System.out.println(problem5.dequeue());
        System.out.println(problem5.dequeue());
        System.out.println(problem5.dequeue());
        System.out.println(problem5.dequeue());
    }

}
