class Solution {
    public int[] runningSum(int[] nums) {
         int arr[]=new int[nums.length];
        int k=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            arr[k++]=sum;
        }
        return arr;
    }
}