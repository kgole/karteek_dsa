class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        // for (int i = 0; i < nums.length; i++) {
        //     output[i] = 1;
        // }
        output[0] = 1;

        // int left = 1;
        // for (int i = 0; i < nums.length; i++) {
        //     output[i] *= left;
        //     left *= nums[i];
        // }
        for(int i=1; i<output.length; i++){
            output[i] = output[i-1] * nums[i-1];
        }

        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= right;
            right *= nums[i];
        }

        return output;        
    }
}

