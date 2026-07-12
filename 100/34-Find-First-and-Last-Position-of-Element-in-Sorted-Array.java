class Solution {
    public int[] searchRange(int[] nums, int target) {
        int c = -1;
        int b = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                c = i;
                break;
            }
        }
        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums[j] == target) {
                b = j;
                break;
            }
        }

        return new int[]{c, b};
    
    }
}