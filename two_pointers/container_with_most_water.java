class Solution {
    public int maxArea(int[] height) {

        int area = 0;
        int left = 0;
        int right = height.length - 1;
        

        while(left < right){

            int width = right - left;

            area = Math.max(area, Math.min(height[right], height[left]) * width);

            if(height[left] <= height[right]){
                left++;
            }
            else{
                right--;
            }

        }

        return area;
        
    }
}