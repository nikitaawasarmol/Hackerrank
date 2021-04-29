

    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
          if(head == null)
                 return null;

     SinglyLinkedListNode rev = null;

      while(head != null){
        SinglyLinkedListNode next = head.next;
        head.next = rev;
        rev = head;
        head = next;
      }
    return rev;


    }


