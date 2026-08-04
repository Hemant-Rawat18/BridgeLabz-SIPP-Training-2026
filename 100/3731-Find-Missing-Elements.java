class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       List<Integer> l = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 == nums[i + 1]) {
                continue;
            } else {
                for (int j = nums[i] + 1; j < nums[i + 1]; j++) {
                    l.add(j);
                }
            }
        }
        return l;
    }
}