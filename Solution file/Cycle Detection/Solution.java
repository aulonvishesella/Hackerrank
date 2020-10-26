/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    //if empty linked list then return false
    if(head==null){
        return false;
    }
      /* Follow the  Robert W. Floyd's tortoise and hare algorithm. One faster node ahead of the other. If the faster node(currentAhead) 
        reaches the slower node(current), then we know there is a cycle.
      */
    else{
        Node current = head;
        Node currentAhead=head.next;
        while(current!=currentAhead){
           if (currentAhead == null || currentAhead.next == null){
               return false;
           } 
           //increment both nodes whereby the faster node(currentAhea) is to be 2* faster
            current = current.next;
            currentAhead = currentAhead.next.next;
       
        }
        return true;
    }
}
