class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            int val = curr.val;
            int count = 0;
            while (curr != null && curr.val == val) {
                count++;
                curr = curr.next;
            }
            if (count == 1) {
                arr.add(val);
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        for (int x : arr) {
            temp.next = new ListNode(x);
            temp = temp.next;
        }
        return dummy.next;
    }
}