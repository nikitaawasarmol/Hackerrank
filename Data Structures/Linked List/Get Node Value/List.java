

    // Complete the getNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        SinglyLinkedListNode pointer = head;
        int count = -1;

        while(head != null) {
            head = head.next;
            if(count < positionFromTail) {
                count++;
            } else {
                pointer = pointer.next;
            }
        }
        return pointer.data;

    }


