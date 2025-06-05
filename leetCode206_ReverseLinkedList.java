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
        ListNode past=null;
        ListNode curr=head;
        ListNode future=null;

        while(curr != null){
            future=curr.next;
            curr.next=past;
            past=curr;
            curr=future;        
        }
        head = past;
        return head;
    }
}
