class Solution {
    public boolean asteroidsDestroyed(int mass, int[] nums) {
        Arrays.sort(nums);
        int k=0;
        long masse=mass;
        for( int i=0;i<nums.length;i++){
            if(masse>=nums[i]){
                masse=masse+nums[i];
                k++;
            }
            else{
                masse=0;
            }
        }
        return k==nums.length;
    }
}