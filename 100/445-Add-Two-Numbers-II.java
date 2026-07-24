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
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>();
        while (l1 != null) {
            arr.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            nums.add(l2.val);
            l2 = l2.next;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int i = arr.size() - 1;
        int j = nums.size() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry != 0) {

            int sum = carry;

            if (i >= 0)
                sum += arr.get(i--);

            if (j >= 0)
                sum += nums.get(j--);

            ans.add(sum % 10);
            carry = sum / 10;
        }
        Collections.reverse(ans);
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        for (int x : ans) {
            temp.next = new ListNode(x);
            temp = temp.next;
        }
        return dummy.next;
    }
}