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
        int count=0;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            count++;
        }
        if(count==n){
            return head.next;
        }
        curr=head;
        int i=1;
        while(curr!=null && curr.next!=null){
            if(i==count-n){
                curr.next=curr.next.next;
            }
            i++;
            curr=curr.next;
        }
        return head;
    }
}