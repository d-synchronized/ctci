package com.threaddynamics.chp3.dishant;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SetOfStacks<E> {

    private List<java.util.Stack<E>> stacks = new ArrayList<>();

    private int threshold;

    private Stack<E> currentStack;

    private int counter = 0;

    private int popCounter = 0;

    public SetOfStacks(int threshold) {
        this.threshold = threshold;
    }

    public void push(E data) {
        if (currentStack == null || currentStack.size() == threshold) {
            System.out.println("***STACK LIMIT EXCEEDED***");

            currentStack = new Stack<>();
            stacks.add(currentStack);
            counter = 0;

            // Increment pop counter with every stack addition.
            popCounter++;
        }
        currentStack.push(data);
        counter++;
    }

    public E pop() {
        if (popCounter == 0) {
            System.out.println("***STACK IS EMPTY***");
            return null;
        }
        E data = null;
        if (counter == 0) {
            System.out.println("**STACK EXHAUSTED !!! Switching to Next STACK**");
            popCounter--;
            counter = threshold;
            currentStack = stacks.get(popCounter - 1);
        }
        data = currentStack.pop();
        counter--;
        return data;
    }

    public E popAt(int index) {
        if (index > popCounter) {
            System.out.print("***Invalid Index**");
        }

        final Stack<E> stackAtIndex = stacks.get(index);
        if (stackAtIndex.isEmpty()) {
            System.out.println("**STACK at index " + index + " EXHAUSTED!!**");
            return null;
        }
        return stackAtIndex.pop();
    }

}
