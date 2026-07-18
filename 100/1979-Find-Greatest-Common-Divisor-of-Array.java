class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n=nums[0];
        int m=nums[nums.length-1];
        int max=0;
        int i=1;
        while(i<=nums[nums.length-1]){
            if(n%i==0 && m%i==0){
                if(max<=i){
                    max=i;
                }
            }
            i++;
        }
        return max;
    }
}