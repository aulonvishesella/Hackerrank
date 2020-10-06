  //O(n) time complexity worst case, O(1) time complexity best case
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        DoublyLinkedListNode trackedHead =head;
        DoublyLinkedListNode current=head;
        //if list is empty
        if(current==null){
            return null;
        }
        //if only 1 value
        else if(current.next == null){
            return current;
        }
        else{
             while(current!=null){
                 //make a temp node of the current previous
                 DoublyLinkedListNode prev = current.prev;
                 //current previous reference will reference not next to current
                 current.prev=current.next;
                 //current next reference will reference the temp prev node
                 current.next=prev;
                 //update the headtracker
                 trackedHead=current;
                 //set current to be the node previous to it
                 current=current.prev;
                
            }
        }
        return trackedHead;
    }
