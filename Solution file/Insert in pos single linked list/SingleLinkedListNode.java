  //o(n) worst case (if we traverse), O(1) best case if we do not traverse
static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
    
    SinglyLinkedListNode insertednode = new SinglyLinkedListNode(data); 
    SinglyLinkedListNode trackedHead =head;
    //if list is empty
    if(head==null){
        head=insertednode;
        return head;
    }
    
    //if we inserting at the start of the linkedlist
    if(position==0){
        insertednode.next=head;
        head=insertednode;
        return head;
    }

    //traverse through and find the position to insert
    //stop traverse if either we reached end of list or we found our position
    SinglyLinkedListNode current=head;
    int posCount=0;
    while(current.next!=null){
        if(posCount+1==position){
            insertednode.next=current.next;
            current.next=insertednode;
            break;
        }
        else{
             posCount++;
             current=current.next;
        }
    }
    return trackedHead;
}