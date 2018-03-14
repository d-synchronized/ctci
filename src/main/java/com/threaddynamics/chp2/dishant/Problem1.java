package com.threaddynamics.chp2.dishant;

import java.util.LinkedList;

public class Problem1 {
    
    private void removingElementLinkedList(final LinkedList<String> linkedList){
        for (int i = 0; i < linkedList.size(); i++) {
            // Set an element to be matched
            String elementToBeMatched = linkedList.get(i);
            for (int j = i + 1; j < linkedList.size(); j++) {
                // Set an element that will be matched
                String traversedElement = linkedList.get(j);
                if (traversedElement.equals(elementToBeMatched)) {
                    System.out.println("Removing element '" + traversedElement + "' at index ' " + j + " '");
                    linkedList.remove(j);
                    break;
                }
            }
        }
        System.out.println("Final List => " + linkedList);
    }
    
    
    private void removingElementCustomList(final List<String> linkedList){
        for (int i = 0; i < linkedList.size(); i++) {
            // Set an element to be matched
            String elementToBeMatched = linkedList.get(i);
            for (int j = i + 1; j < linkedList.size(); j++) {
                // Set an element that will be matched
                String traversedElement = linkedList.get(j);
                if (traversedElement.equals(elementToBeMatched)) {
                    System.out.println("Removing element '" + traversedElement + "' at index ' " + j + " '");
                    linkedList.remove(j);
                    break;
                }
            }
        }
        System.out.println("Final List => " + linkedList);
    }

    public static void main(String[] args) {
        final LinkedList<String> list = new LinkedList<String>();
        list.add("Lets");
        list.add("the");
        list.add("crack");
        list.add("the");
        list.add("code");
        list.add("crack");
        list.add("Lets");
        System.out.println("Original List => " + list);
        new Problem1().removingElementLinkedList(list);
        
        
        final List<String> customList = new List<>();
        customList.add("Lets");
        customList.add("the");
        customList.add("crack");
        customList.add("the");
        customList.add("code");
        customList.add("crack");
        customList.add("Lets");
        System.out.println("(Custom)Before Deletion => " + customList);
        new Problem1().removingElementCustomList(customList);
    }

}
