class Solution {
    public int numOfPairs(String[] nums, String target) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                String s=nums[i]+nums[j];
                if(s.equals(target)){
                    count++;
                }
                }
            }
        }
        return count;
    }
}