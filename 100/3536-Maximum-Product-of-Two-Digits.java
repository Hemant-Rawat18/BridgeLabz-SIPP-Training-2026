class Solution {
    public int maxProduct(int n) {
        // int first = 0;
        // int second = 0;

        // while (n > 0) {
        //     int digit = n % 10;

        //     if (digit > first) {
        //         second = first;
        //         first = digit;
        //     } else if (digit > second) {
        //         second = digit;
        //     }

        //     n = n / 10;
        // }

        // return first * second;
     ArrayList<Integer>arr=new ArrayList<>();
        while(n>0){
            int temp=n%10;
            arr.add(temp);
            n=n/10;
            
        }
        Collections.sort(arr);
        return arr.get(arr.size()-1)*arr.get(arr.size()-2);
    }
}