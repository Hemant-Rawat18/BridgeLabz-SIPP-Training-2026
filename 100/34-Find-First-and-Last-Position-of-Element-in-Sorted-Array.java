class Solution {
    public int[] searchRange(int[] nums, int target) {
        int c=-1;
        int r=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;j>=0;j--){
                if(nums[j]==target){
                    r=j;
                    break;
                }
            }
            if(nums[i]==target){
                c=i;
                break;
            }
        }
        return new int[]{c,r};
    }
}