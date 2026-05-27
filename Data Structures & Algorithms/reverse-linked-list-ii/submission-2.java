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
        ListNode fh = head;
        ListNode first = head ;
        ListNode prevfirst = null ;
        ListNode nextSecond = null ;
        ListNode second = head ;
        ListNode prev = null;
        int pos = 0;
        while(head!=null){
            pos++;
            if(pos == left){
                first = head;
                prevfirst = prev;
            } 
            if(pos == right){
                second = head;
                nextSecond = head.next;
            } 
            prev = head;
            head=head.next;
        }

        

        if(prevfirst!=null) prevfirst.next = null;
        second.next = null;
        prev = null;
        ListNode curr = null;
        ListNode tempFirst = first;
        while(first!=null){
            curr = first;
            first = first.next;
            curr.next = prev;
            prev = curr;
        }

        System.out.println(curr.val + " " + tempFirst.val);

        if(prevfirst != null ){
            prevfirst.next = curr;
        }
        if(nextSecond!=null){
            tempFirst.next = nextSecond;
        }

        return prevfirst!= null ? fh : curr;
    }
}