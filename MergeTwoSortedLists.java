class Solution {
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {

        if(head1 == null) return head2;
        if(head2 == null) return head1;
        ListNode temp = null;
        if(head1.val < head2.val){
            temp = head1;
            head1 = head1.next;
        }
        else{
            temp = head2;
            head2 = head2.next;
        }
        ListNode newNode = temp;
        while(head1 != null && head2 != null){
            if(head1.val < head2.val){
            temp.next = head1;
            head1 = head1.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        if(head1 == null) temp.next = head2;
        if(head2 == null) temp.next = head1;
        return newNode;
    }
}
