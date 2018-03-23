package com.threaddynamics.chp3.dishant;

/**
 * 
 * Imagine a (literal) stack of plates. If the stack gets too high, it might
 * topple. Therefore, in real life, we would likely start a new stack when the
 * previous stack exceeds some threshold. Implement a data structure SetOfStacks
 * that mimics this. SetOfStacks should be composed of several stacks, and
 * should create a new stack once the previous one exceeds capacity.
 * SetOfStacks.push() and SetOfStacks.pop() should behave identically to a
 * single stack (that is, pop() should return the same values as it would if
 * there were just a single stack). FOLLOW UP Implement a function popAt(int
 * index) which performs a pop operation on a specific sub-stack.
 * 
 * 
 ***/
public class Problem3 {
    
    public static void main(String[] args) {
        final SetOfStacks<Integer> setOfStacks = new SetOfStacks<>(3);
        
        int counter = 1;
        setOfStacks.push(counter++);
        setOfStacks.push(counter++);
        setOfStacks.push(counter++);
        setOfStacks.push(counter++);
        setOfStacks.push(counter++);
        setOfStacks.push(counter++);
        setOfStacks.push(counter++);
        setOfStacks.push(counter++);
        
        
        System.out.println(setOfStacks.pop());
        System.out.println(setOfStacks.pop());
        System.out.println(setOfStacks.pop());
        System.out.println(setOfStacks.pop());
        System.out.println(setOfStacks.pop());
        System.out.println(setOfStacks.pop());
        System.out.println(setOfStacks.pop());
        System.out.println(setOfStacks.pop());
    }

}
