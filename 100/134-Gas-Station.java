class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum=0;
        for(int i=0;i<gas.length;i++){
            sum=sum+gas[i];
        }
        int sums=0;
        for(int i=0;i<cost.length;i++){
            sums=sums+cost[i];
        }
        if(sum<sums)return -1;
        int start=0;
        int temp=0;
        for(int i=0;i<gas.length;i++){
            start=start+gas[i]-cost[i];
            if(start<0){
                temp=i+1;
                start=0;
            }

        }
        return temp;
    }
}