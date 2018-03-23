package com.threaddynamics.chp3.dishant;

import java.util.Stack;

/***
 * <pre>
 * In the classic problem of the Towers of Hanoi, you have 3 rods and N disks of different sizes which can slide onto any tower. The puzzle starts with disks sorted in ascending order of size from top to bottom (e.g., each disk sits on top of an even larger one). You have the following constraints:
 * (A) Only one disk can be moved at a time.
 * (B) A disk is slid off the top of one rod onto the next rod.
 * (C) A disk can only be placed on top of a larger disk.
 * Write a program to move the disks from the first rod to the last using Stacks.
 * </pre>
 * 
 **/
public class Problem4 {

    Stack<Integer> tower1 = new Stack<>();

    Stack<Integer> tower2 = new Stack<>();

    Stack<Integer> tower3 = new Stack<>();

    private void arrangeDisks() {
        while (!tower1.isEmpty()) {
            Integer disk = tower1.pop();

            if (tower2.size() == 0) {
                tower2.add(disk);
                if (tower3.size() > 1) {
                    int counter = 0;
                    while (!tower3.isEmpty()) {
                        tower1.add(tower3.pop());
                        counter++;
                    }
                    tower3.add(tower2.pop());
                    while (counter > 0) {
                        tower3.add(tower1.pop());
                        counter--;
                    }
                }
                continue;
            }

            if (tower3.size() == 0) {
                tower3.add(disk);
                tower3.add(tower2.pop());
            }
        }
    }

    public static void main(String[] args) {
        Problem4 problem4 = new Problem4();

        problem4.tower1.add(5);
        problem4.tower1.add(4);
        problem4.tower1.add(3);
        problem4.tower1.add(2);
        problem4.tower1.add(1);

        problem4.arrangeDisks();

        System.out.println(problem4.tower3);
    }

}
