class Solution {
    public int maxProduct(int n) {
        int mul=1;
        int max=Integer.MIN_VALUE;
        while(n>0){
            int temp=n%10;
            if(temp!=0){
            mul=mul*temp;
             max=Math.max(mul,max);
            n=n/10;

            }

        }
        return max;
        
    }
}