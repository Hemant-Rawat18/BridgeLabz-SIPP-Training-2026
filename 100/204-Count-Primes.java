class Solution {
    public int countPrimes(int n) {
        // int count = 0;
        // for (int i = 2; i < n; i++) {   
        //     ArrayList<Integer> arr1 = new ArrayList<>();
        //     for (int k = 1; k <= i; k++) {
        //         if (i % k == 0) {
        //             arr1.add(k);
        //         }
        //     }
        //     if (arr1.size() == 2) {
        //         count++;
        //     }
        // }
        // return count;
        
        if (n <= 2)
            return 0;

        boolean[] prime = new boolean[n];

        for (int i = 2; i < n; i++) {
            prime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (prime[i]) {
                for (int j = i * i; j < n; j += i) {
                    prime[j] = false;
                }
            }
        }

        int count = 0;

        for (int i = 2; i < n; i++) {
            if (prime[i])
                count++;
        }

        return count;
    }
}
    