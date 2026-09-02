class Solution {
    public int maxProfit(int[] prices) {
        // int dem=0;
        // for(int i=0;i<prices.length;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         int max=prices[j]-prices[i];
        //         dem=Math.max(max,dem);
        //     }
        // }
        // return dem;
        int min=prices[0];
        int max=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            max=Math.max(max,prices[i]-min);
        }
        return max;
        
    }
}