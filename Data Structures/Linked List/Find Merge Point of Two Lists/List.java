

    // Complete the findMergeNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode head1_cur = head1;
        SinglyLinkedListNode head2_cur = head2;

        while(head1_cur != head2_cur) {
            if(head1_cur.next == null) {
                head1_cur = head2;
            }
            else {
                head1_cur = head1_cur.next;
            }
            if(head2_cur.next == null) {
                head2_cur = head1;
            }
            else {
                head2_cur = head2_cur.next;
            }
        }
        return head1_cur.data;


    }


