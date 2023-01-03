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
    public ListNode reverseList(ListNode head) {
        return reverseLista(head);
    }
    public ListNode reverseLista(ListNode A) {
        ListNode h1 = A;
        ListNode t = A;
        ListNode h2 = null;
        while(h1!=null){
            t=h1;
            h1= h1.next;
            t.next=h2;
            h2=t;
        }

        return h2;
    }
}