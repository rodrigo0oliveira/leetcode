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
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set = new HashSet<>();

        ListNode actual = head;
        ListNode back = null;

        while(actual!=null){
            if(set.contains(actual.val)){
                back.next = actual.next;
            }else{
                set.add(actual.val);
                back = actual;
            }
            actual = actual.next;
        }

        return head;
    }
}