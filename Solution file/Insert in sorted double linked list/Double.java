
     //time complexity = o(n) worst case (traverse to find where to insert), O(1) best case (inserting at head/in empty linked list)
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode insertednode = new DoublyLinkedListNode(data); 
        DoublyLinkedListNode trackedHead =head;
        DoublyLinkedListNode current=head;
        //if list is empty
        if(current==null){
            return insertednode;
        }
        
        //if we inserting at the start of the linkedlist
        else if(current.data>data){
            current.prev=insertednode;
            insertednode.next=current;
            current=insertednode;
            return insertednode;
        }

        //need to traverse to find where to insert
        else{
            while(current!=null){
                if(current.next == null || current.next.data >= data){
                    //if inserting at the tail
                    if(current.next==null){
                        current.next=insertednode;
                        insertednode.prev=current;
                        insertednode.next=null;
                        break;
                    }
                    //inserting somewhere else (not at tail and not at head)
                    else{
                         insertednode.next=current.next;  
                        current.next.prev=insertednode;  
                        current.next=insertednode;
                        insertednode.prev=current;    
                        break;
                    }
                }
                //increment
                else{
                    current=current.next;
                }
                
            }
            return trackedHead;
        }
            
    }
