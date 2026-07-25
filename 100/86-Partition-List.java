class Solution {
    public ListNode partition(ListNode head, int x) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head;

        while (curr != null) {
            arr.add(curr.val);
            curr = curr.next;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < x) {
                ans.add(arr.get(i));
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= x) {
                ans.add(arr.get(i));
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        for (int num : ans) {
            temp.next = new ListNode(num);
            temp = temp.next;
        }

        return dummy.next;
    }
}