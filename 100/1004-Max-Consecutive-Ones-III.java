class Solution {
    public int longestOnes(int[] nums, int k) {
        int C1=0;
        int C0=0;
        int l=0;
        int r=0;
        int maxwindow=0;
        for(r=0;r<nums.length;r++){
            if(nums[r]==0){
                C0++;
            }
            while(C0>k){
                if(nums[l]==0){
                C0--;
                }
                l++;

            }
           int  length=r-l+1;
            maxwindow=Math.max(maxwindow,length);
        }
        return maxwindow;

        
    }
}