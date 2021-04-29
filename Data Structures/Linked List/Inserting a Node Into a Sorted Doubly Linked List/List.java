

    // Complete the sortedInsert function below.

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        if (head == null)
            return new DoublyLinkedListNode(data);
        if(head.data > data) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(data);
            node.next = head;
            return node;
        }
            head.next = sortedInsert(head.next, data);
            return head;


    }


