class Solution {
    public long sumAndMultiply(int n) {
        ArrayList<Integer>arr=new ArrayList<>();
        String str=String.valueOf(n);
        long sum=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)-'0'>0){
                arr.add(str.charAt(i)-'0');
                sum=sum+str.charAt(i)-'0';
            }
        }
        long num=0;
        for(int digit:arr){
            num=num*10+digit;
        }
        return sum*num;
    }
}