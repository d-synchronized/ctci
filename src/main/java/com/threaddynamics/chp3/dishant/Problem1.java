package com.threaddynamics.chp3.dishant;

/**
 * 
 * Implement K stacks in array of size n.
 * 
 **/
public class Problem1 {
    
    int[] array;
    
    int[] top;
    
    int[] next;
    
    int free;
    
    public Problem1(int numberOfStacks, int arraySize){
        array = new int[arraySize];
        top = new int[numberOfStacks];
        next = new int[arraySize];
        
        free = 0;
        
        for(int i =0 ; i < arraySize ;i++){
            next[i] = i + 1;
        }
        next[arraySize - 1] = -1;
        
        
        for(int i=0 ; i < numberOfStacks ; i++){
            top[i] = -1;
        }
    }
    
    private boolean isFull(){
        if(free == -1){
            return true;
        }
        return false;
    }
    
    private boolean isEmpty(int stackNumber){
        if(top[stackNumber] == -1){
            return true;
        }
        return false;
    }
    
    private void push(int data , int stackNumber){
        if(isFull()){
            System.out.println("**STACK IS FULL**");
            return;
        }
        
        int workableIndex = free;
        free = next[workableIndex];
        
        array[workableIndex] = data;
        
        next[workableIndex] = top[stackNumber];
        top[stackNumber] = workableIndex;
    }
    
    private int pop(int stackNumber){
        if(isEmpty(stackNumber)){
            System.out.print("***STACK IS EMPTY***");
            return -1;
        }
        int workableIndex  = top[stackNumber];
        int data = array[workableIndex];
        
        top[stackNumber] = next[workableIndex];
        return data;
    }
    
    private void printStackElements(int stackNumber){
        int workableIndex = top[stackNumber];
        while(workableIndex != -1){
            System.out.println(array[workableIndex]);
            workableIndex = next[workableIndex];
        }
    }
    
    public static void main(String[] args) {
        final Problem1 problem1 = new Problem1(3, 10);
        
        problem1.push(1, 0);
        problem1.push(2, 0);
        problem1.push(3, 0);
        
        problem1.push(34, 1);
        problem1.push(33, 1);
        problem1.push(32, 1);
        
        problem1.push(99, 2);
        problem1.push(100, 2);
        problem1.push(101, 2);
        
        problem1.printStackElements(0);
        problem1.printStackElements(1);
        problem1.printStackElements(2);
        
        System.out.println("***After POP Operation*");
        
        problem1.pop(0);
        problem1.printStackElements(0);
        
        System.out.println("***After POP Operation*");
        
        problem1.pop(0);
        problem1.printStackElements(0);
    }

}
