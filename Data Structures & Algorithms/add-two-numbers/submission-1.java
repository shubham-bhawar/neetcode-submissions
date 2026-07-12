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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if((l1.next == null && l1.val == 0)) return l2;
        if((l2.next == null && l2.val == 0)) return l1;

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int rem = 0 ;
        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val+rem;
            temp.next = new ListNode(sum%10);
            temp=temp.next;
            l1 = l1.next;
            l2=l2.next;
            rem = sum/10;
        }

        while(l1!=null){
            int sum = l1.val+rem;
            temp.next = new ListNode(sum%10);
            temp=temp.next;
            l1 = l1.next;
            rem = sum/10;
        }
        while(l2!=null){
            int sum = l2.val+rem;
            temp.next = new ListNode(sum%10);
            temp=temp.next;
            l2 = l2.next;
            rem = sum/10;
        }

        if(rem == 1){
            temp.next= new ListNode(1);
        }
        return dummy.next;
    }
}
