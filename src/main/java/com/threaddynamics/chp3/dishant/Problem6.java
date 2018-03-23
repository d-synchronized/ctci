package com.threaddynamics.chp3.dishant;

import java.util.Stack;

/**
 * 
 * Write a program to sort a stack in ascending order. You should not make any
 * assumptions about how the stack is implemented. The following are the only
 * functions that should be used to write this program: push | pop | peek |
 * isEmpty.
 * 
 **/
public class Problem6 {

    final Stack<Integer> stack = new Stack<>();

    final Stack<Integer> temporaryStack = new Stack<>();

    private void sortStack() {
        final Integer data = stack.pop();
        temporaryStack.push(data);

        while (!stack.isEmpty()) {
            if (stack.peek() > temporaryStack.peek()) {
                temporaryStack.push(stack.pop());
                continue;
            }
            Integer element = stack.pop();
            while (!temporaryStack.isEmpty()) {
                int elementOnTempStack = temporaryStack.peek();
                if (elementOnTempStack > element) {
                    stack.push(temporaryStack.pop());
                    continue;
                }
                break;
            }
            temporaryStack.push(element);
        }
    }

    public static void main(String[] args) {
        final Problem6 problem6 = new Problem6();
        problem6.stack.add(34);
        problem6.stack.add(3);
        problem6.stack.add(31);
        problem6.stack.add(98);
        problem6.stack.add(92);
        problem6.stack.add(23);

        problem6.sortStack();

        System.out.println(problem6.temporaryStack);
    }

}
