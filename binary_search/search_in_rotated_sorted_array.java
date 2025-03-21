// class Solution {
//     public int search(int[] nums, int target) {
        
//         int result = 0;
//         int rotation_index = 0;

//         if(nums.length <= 1){
//             if(nums.length == 0){
//                 return -1;
//             }
//             else if(nums[0] == target){
//                 return 0;
//             }
//             return -1;
//         }

//         for(int i=0; i<nums.length-1; i++){
//             if(nums[i] > nums[i+1]){
//                 rotation_index = i+1;
//             }
//         }
//         // System.out.println(rotation_index);
//         int left = 0;
//         int right = 0;
//         if(nums[rotation_index] == target){
//             return rotation_index;
//         }
//         else if(nums[rotation_index] < target){
//             left = rotation_index;
//         }
//         else{
//             right = rotation_index;
//         }

//         while(left < right){
//             int mid = right - left / 2;

//             if(nums[mid] == target){
//                 return mid;
//             }
//             else if(nums[mid] > target){
//                 right = mid-1;
//             }
//             else{
//                 left = mid + 1;
//             }
//         }

//         return -1;
//     }
// }

class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] >= nums[left]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            else {
                if (target <= nums[right] && target > nums[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}