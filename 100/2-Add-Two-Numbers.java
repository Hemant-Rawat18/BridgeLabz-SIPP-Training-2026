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
        ArrayList<Integer>arr=new ArrayList<>();
        ArrayList<Integer>arr1=new ArrayList<>();
        while(l1!=null){
            arr.add(l1.val);
            l1=l1.next;
        }
         while(l2!=null){
            arr1.add(l2.val);
            l2=l2.next;
        }
        ArrayList<Integer>nums=new ArrayList<>();
        int max=Math.max(arr.size(),arr1.size());
        int carry=0;
        for(int i=0;i<max;i++){
            int x=(i<arr.size())?arr.get(i):0;
            int y=(i<arr1.size())?arr1.get(i):0;
            int sum=x+y+carry;
            nums.add(sum%10);
            carry=sum/10;
        }
        if(carry>0){
            nums.add(carry);
        }
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        for(int d:nums){
            temp.next=new ListNode(d);
            temp=temp.next;
        }
        return dummy.next;
        
    }
}