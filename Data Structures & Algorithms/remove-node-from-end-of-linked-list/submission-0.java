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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = head;
        ListNode second = dummy;

        //move first n+1 steps
        for(int i =0;i<n;i++)
        {
            first = first.next;
        }
        

        while(first != null)
        {
            //move first and second both 
            first = first.next;
            second = second.next;
            
        }
     second.next = second.next.next;
       return dummy.next;
    }
}
