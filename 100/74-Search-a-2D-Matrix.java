// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int m=matrix.length;
//         int n=matrix[0].length;
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(matrix[i][j]==target){
//                     return true;

//                 }
//             }
//         }
//         return false;
//     }
// }
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low = 0;
        int high = m * n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int value = matrix[mid / n][mid % n];
            if (value == target)
                return true;
            else if (value < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }
}