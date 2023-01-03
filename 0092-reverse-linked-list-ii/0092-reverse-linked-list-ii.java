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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        return reverseBetweeen(head,left,right);
    }
        public ListNode reverseList(ListNode A, int B) {
        if(B<=1||A==null){
            return A;
        }
        ListNode h1 = A;
        ListNode h2 = null;
        ListNode t =A;
        int c = B;
        while(c>0 && h1!=null){
            t=t.next;
            h1.next=h2;
            h2=h1;
            h1=t;
            c--;
        }
        A.next = h1;
        return h2;
    }
    public ListNode reverseBetweeen(ListNode A, int B, int C) {

        int q  = 1;
        ListNode temp = A;
        if (B==1){
            return reverseList(temp,(C-B+1));
        }
        while(temp!=null){
            if(q==B-1){
                int k = C-B+1;
                
                ListNode te = temp;
                ListNode t1 = reverseList(temp.next,k);
                te.next=t1;
                break;
            }else{
                temp=temp.next;
            }
            q++;
        }
        return A;        
    }
}