//Binary Search
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //find which n our number could be in
        int matrixToFind = 0;
        int l = 0;
        int r = matrix.length-1;
        while (l <= r) {
            int mid = (r + l)/2;
            if(target < matrix[mid][0]) {
                r = mid - 1;
            }
            else if(target > matrix[mid][matrix[0].length-1]) {
                l = mid + 1;
            }
            else {
                matrixToFind = mid;
                break;
            }
        }
        System.out.println(matrixToFind);
        int secondLeft = 0;
        int secondRight = matrix[matrixToFind].length-1;
        while (secondLeft <= secondRight) {
            int mid = (secondLeft + secondRight) / 2;
            if(target < matrix[matrixToFind][mid]) {
                secondRight = mid - 1;
            }
            else if(target > matrix[matrixToFind][mid]) {
                secondLeft = mid + 1;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
