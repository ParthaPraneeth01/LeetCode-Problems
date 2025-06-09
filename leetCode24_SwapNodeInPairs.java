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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode tail = dummy;
        while(tail.next!=null && tail.next.next!=null){
            ListNode slow=tail.next;
            ListNode fast=tail.next.next;

            tail.next=fast;
            slow.next=fast.next;
            fast.next=slow;

            tail=slow;
        }
        return dummy.next;
    }
}
