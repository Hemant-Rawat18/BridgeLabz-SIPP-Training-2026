class Solution {
    public int reverseDegree(String s) {
        //return ('z'-'a'-0+1);
        int sum=0;
        int k=1;
        for(int i=0;i<s.length();i++){
            sum=sum+k*('z'-s.charAt(i)-0+1);
            k++;
        }
        return sum;
    }
}