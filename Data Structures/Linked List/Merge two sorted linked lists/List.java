 

    // Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;
        SinglyLinkedListNode head3 = null;
        if (head1.data < head2.data) {
            head3 = head1;
            head1 = head1.next;
        }else {
             head3 = head2;
            head2 = head2.next;

        }
        SinglyLinkedListNode cur_node = head3;
        while(head1 != null && head2 != null) {
            if(head1.data < head2.data) {
                cur_node.next = head1;
                head1 = head1.next;
            } else {
                cur_node.next = head2;
                head2 = head2.next;
            }
            cur_node = cur_node.next;
        }
        if (head1 == null) {
            cur_node.next = head2;
        } else {
            cur_node.next = head1;
            }
        return head3;



    }


