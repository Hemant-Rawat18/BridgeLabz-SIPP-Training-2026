class Solution {
    public int longestOnes(int[] nums, int k) {
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            count=0;
            int temp=k;

            for(int j=i;j<nums.length;j++){
                if(nums[j]==1){
                    count++;
                }else{
                    if(temp>0){
                        count++;
                        temp--;
                    }else{
                        break;
                    }
                }
            }
            max=Math.max(count,max);
        }
        return max;
    }
}