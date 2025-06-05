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
    public int getDecimalValue(ListNode head) {
        String binary="";
        ListNode curr=head;
        ListNode temp=head;
        while(curr!=null){
            char ch=(char)(curr.val+'0');
            binary+=ch;
            curr=curr.next;
        }
        int dec=Integer.parseInt(binary,2);
        return dec;
    }
}
