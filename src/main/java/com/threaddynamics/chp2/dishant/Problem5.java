package com.threaddynamics.chp2.dishant;

public class Problem5 {
    
    private static void detectAndRemoveLoopInList(final LinkedList<Integer> list){
        Node<Integer> slowPointer = list.head;
        Node<Integer> fastPointer = list.head;
        
        while(slowPointer != null && fastPointer != null && fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            
            if(slowPointer == fastPointer){
                removeLoop(list, slowPointer);
                break;
            }
        }
        
        Node<Integer> headNode = list.head;
        while(true){
            System.out.println(headNode.data);
            if(headNode.next == null){
                break;
            }
            headNode = headNode.next;
        }
    }
    
    
    private static int findTotalNodeInLoop(Node<Integer> pointersMeetingPoint){
        int noOfNodesInLoop = 1;
        Node<Integer> movablePtr = pointersMeetingPoint;
        while(pointersMeetingPoint != movablePtr.next){
            movablePtr= movablePtr.next;
            noOfNodesInLoop++;
        }
        return noOfNodesInLoop;
    }
    
    private static Node<Integer> fetchHeadNodeInLoop(LinkedList<Integer> list, int noOfNodesInLoop){
        Node<Integer> pointerA = list.head;
        
        //Move pointerB to number of positions specified by noOfNodesInLoop
        Node<Integer> pointerB = list.head;
        for(int counter = 0; counter < noOfNodesInLoop; counter++){
            pointerB = pointerB.next;
        }
        
        //Theorm states that if they now move at same pace they will surely meet at the start node of the loop(Floyd Theorm).
        while(pointerA != pointerB){
            pointerA = pointerA.next;
            pointerB = pointerB.next;
        }
        
        return pointerB;
    }
    
    private static void removeLoop(final LinkedList<Integer> list , Node<Integer> pointersMeetingPoint){
        final int noOfNodesInLoop = findTotalNodeInLoop(pointersMeetingPoint);
        Node<Integer> headNodeOfLoop = fetchHeadNodeInLoop(list, noOfNodesInLoop);
        
        //Traverse 'noOfNodesInLoop' number of times from head of node
        for(int i=1 ; i < noOfNodesInLoop ; i++){
            headNodeOfLoop = headNodeOfLoop.next;
        }
        //remove loop
        headNodeOfLoop.next = null;
    }
    
    
    public static void main(String[] args) {
        final LinkedList<Integer> list = new LinkedList<>();
        
        final Node<Integer> head = new Node<>(1, null);
        
        list.head = head;
        head.next = new Node<>(2, null);
        head.next.next = new Node<>(3, null);
        head.next.next.next = new Node<>(4, null);
        head.next.next.next.next = new Node<>(5, null);
        
        head.next.next.next.next.next = head.next.next;
        
        detectAndRemoveLoopInList(list);
    }

}
