class Solution {
    public void moveZeroes(int[] nums) {
        int nums1[]=new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums1[k++]=nums[i];

            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=nums1[i];
        }

    }
}