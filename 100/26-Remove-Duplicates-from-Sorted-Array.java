class Solution {
    public int removeDuplicates(int[] nums) {
       ArrayList<Integer>ar=new ArrayList<>();
       for(int i=0;i<nums.length-1;i++){
        if(nums[i]!=nums[i+1]){
            ar.add(nums[i]);
        }
       }
       ar.add(nums[nums.length-1]);
       for(int i=0;i<ar.size();i++){
        nums[i]=ar.get(i);
       }
       return ar.size();
    }
}