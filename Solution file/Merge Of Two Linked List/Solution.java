
     //O(n) time complexity
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode currentHead1=head1;
        SinglyLinkedListNode currentHead2=head2;
         //loop while the two nodes are not the same
         while(currentHead1 != currentHead2){
             //if we reach the end of first linked list, start at the other linked list
            if(currentHead1.next == null){
                currentHead1= head2;

            //else we increment to to the other npde
            }else{
                currentHead1 = currentHead1.next;
            }
            //repeat for the second linked list
            if(currentHead2.next == null){
                currentHead2 = head1;
            }else{
                currentHead2 = currentHead2.next;
            }
        }
        return currentHead2.data;
    }
