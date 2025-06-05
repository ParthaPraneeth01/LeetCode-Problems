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
    int length(ListNode a){
        ListNode list=a;
        int count=0;
        while(list!=null){
            count++;
            list=list.next;
        }
        return count;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead=new ListNode(0);
        ListNode dummy=dummyHead;
        ListNode a=l1;
        ListNode b=l2;
        int carry=0;
        while(a!=null || b!=null || carry!=0){
            int n1=a==null?0:a.val;
            int n2=b==null?0:b.val;
            int sum=n1+n2+carry;
                    
            carry = sum / 10;
            dummy.next = new ListNode(sum % 10);
            dummy = dummy.next;
            if(a!=null)a=a.next;
            if(b!=null)b=b.next;
        }
        return dummyHead.next;
    }
}
