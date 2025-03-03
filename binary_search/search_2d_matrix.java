class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int top = 0;
        int bottom = matrix.length - 1;

        while(top <= bottom){
            int mid = (top + bottom) / 2;

            if(matrix[mid][0] == target){
                return true;
            }
            else if(matrix[mid][0] > target){
                bottom = mid - 1;
            }
            else{
                top = mid + 1;
            }
        }

        int row = (top + bottom) / 2;
        int left = 0;
        int right = matrix[row].length - 1;

        while(left <= right){
            int middle_sub = (left + right) / 2;
            
            if(matrix[row][middle_sub] == target){
                return true;
            }
            else if(matrix[row][middle_sub] > target){
                right = middle_sub - 1;
            }
            else{
                left = middle_sub + 1;
            }
        }

        return false;

        
        
    }
}