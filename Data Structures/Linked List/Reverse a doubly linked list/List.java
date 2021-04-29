

    // Complete the reverse function below.

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
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        if (head == null) return head;
        DoublyLinkedListNode current_node = head;
        DoublyLinkedListNode new_head = head;

        while (current_node != null) {
            DoublyLinkedListNode prev = current_node.prev;
            current_node.prev= current_node.next;
            current_node.next = prev;
            new_head = current_node;
            current_node = current_node.prev;
        }

        return new_head;
    }


