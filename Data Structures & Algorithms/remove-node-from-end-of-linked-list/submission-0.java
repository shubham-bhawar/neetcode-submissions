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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int lengthOList = 0;
        ListNode temp = head;
        while(temp!=null){
            temp=temp.next;
            lengthOList++;
        }

        int removeNode = lengthOList-n;
        temp = head;
        ListNode prev =null;

        while(removeNode>0){
            prev=temp;
            temp=temp.next;
            removeNode--;
        }
        if(temp==head){
            head=head.next;
            return head;
        }

        if(temp==null){
            prev.next=temp;
        }else{
            prev.next=temp.next;
            temp.next=null;
        }
        return head;
         

    }
}
