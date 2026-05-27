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

    public void reverseAfterMiddle(ListNode tempo){
        if(tempo.next == null ) return;
        ListNode fh = tempo;
        ListNode fast = tempo;
        ListNode slow = tempo;
        ListNode prev = null;
        while(fast!=null && fast.next !=null){
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        prev.next = null;
        prev = null;
        ListNode curr = null;
        while(slow!=null){
            curr=slow;
            slow=slow.next;
            curr.next = prev;
            prev = curr;
        }
        // firstHead = fh , new head = curr ;
        ListNode fn ;
        ListNode sn ;
        while(fh != null){
            fn = fh.next;
            sn = curr.next;

            fh.next = curr;
            curr.next = (fn == null) ? sn : fn ;
            fh = fn;
            curr = sn;

        }

    }

    public void reorderList(ListNode head) {
        ListNode sec = head;
        reverseAfterMiddle(sec);
        return;
    }
}
