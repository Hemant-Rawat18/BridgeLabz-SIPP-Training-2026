class Solution {
    public String largestNumber(int[] nums) {
      String []ch=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            ch[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(ch,(a,b)->(b+a).compareTo(a+b));
        if (ch[0].equals("0")) return "0";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<ch.length;i++){
            sb.append(ch[i]);
        }
        return sb.toString();
    }
}