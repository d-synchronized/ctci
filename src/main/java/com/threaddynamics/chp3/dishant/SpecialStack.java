package com.threaddynamics.chp3.dishant;

public class SpecialStack {
    
    Integer minElement;
    
    Node topNode;
    
    public void push(Integer data){
        if(minElement == null){
            minElement = data;
            final Node node = new Node(data, null);
            topNode = node;
        }else{
            if(data < minElement){
                int newCalculatedValue = 2 * data - minElement;
                minElement = data;
                data = newCalculatedValue;
            }
            final Node node = new Node(data, null);
            node.next = topNode;
            topNode = node;
        }
    }
    
    public Integer pop(){
        if(topNode == null){
            System.out.println("**STACK IS EMPTY**");
            return null;
        }
        
        int data = topNode.data;
        if(data < minElement){
            int elementRemoved = minElement;
            minElement = 2 * minElement - data;
            data =  elementRemoved;
        }
        topNode = topNode.next;
        return data;
    }
    
    public Integer minElement(){
        return minElement;
    }
    
    static class Node{
        
        Integer data;
        
        Node next;
        
        public Node(Integer data, Node next) {
            this.data = data;
            this.next = next;
        }
        
    }

}
