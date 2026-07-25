class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            arr.add(curr.val);
            curr = curr.next;
        }
        int n = arr.size();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = 0; 
            for (int j = i + 1; j < n; j++) {
                if (arr.get(j) > arr.get(i)) {
                    ans[i] = arr.get(j);
                    break;
                }
            }
        }
        return ans;
    }
}