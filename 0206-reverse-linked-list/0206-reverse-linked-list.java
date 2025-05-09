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
        

        ListNode actual = head;
        ListNode back = null;
        ListNode prox = null;

        while(actual!=null){
            prox = actual.next;
            actual.next = back;
            back=actual;
            actual = prox;
        }

        return back;


    }
}