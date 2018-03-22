package com.threaddynamics.chp3.dishant;

public class Problem2 {
   
    public static void main(String[] args) {
        final SpecialStack specialStack = new SpecialStack();
        specialStack.push(3);
        specialStack.push(5);
        specialStack.push(2);
        specialStack.push(1);
        specialStack.push(1);
        specialStack.push(-1);
        
        System.out.println("Minimum Element => " + specialStack.minElement());
        
        System.out.println(specialStack.pop());
        System.out.println(specialStack.pop());
        System.out.println(specialStack.pop());
        System.out.println(specialStack.pop());
        System.out.println(specialStack.pop());
        System.out.println(specialStack.pop());
        System.out.println(specialStack.pop());
    }

}
