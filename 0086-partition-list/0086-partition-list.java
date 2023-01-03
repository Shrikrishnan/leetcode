/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        return partitione(head,x);
        
    }
    public ListNode partitione(ListNode A, int B) {
        ListNode head1 = null;
        ListNode temp1 = null;
        ListNode head2 = null;
        ListNode temp2 = null;
        ListNode temp = A;
        ListNode next = null;
        while(temp!=null){
            if(temp.val<B){
                if(head1==null && temp1 == null){
                    head1=temp;
                    temp1=temp;
                    next=temp.next;
                    head1.next=null;
                }else{
                    next=temp.next;
                    temp1.next=temp;
                    temp1=temp;
                    temp.next=null;
                }
            }else{
                if(head2==null && temp2 == null){
                    head2=temp;
                    temp2=temp;
                    next=temp.next;
                    temp.next=null;
                }else{
                    next=temp.next;
                    temp2.next=temp;
                    temp2=temp;
                    temp.next=null;
                }
               
            }
             temp=next;
        }

        if(head1==null){
            return head2;
        }
        temp1.next=head2;
        return head1;
        
    }
}


