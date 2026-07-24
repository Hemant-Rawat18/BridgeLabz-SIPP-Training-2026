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
    public void reorderList(ListNode head) {
        ArrayList<Integer>arr=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            arr.add(curr.val);
            curr=curr.next;
        }
        ArrayList<Integer>nums=new ArrayList<>();
        int l=0;
        int r=arr.size()-1;
        while(l<=r){
            nums.add(arr.get(l));
            nums.add(arr.get(r));
            l++;
            r--;

        }
        curr=head;
        int i=0;
        while(curr!=null){
            curr.val=nums.get(i);
            curr=curr.next;
            i++;
        }
    }
}