class Solution {
    public int maxProduct(int[] nums) {
        // brute force
        // if(nums.length < 1){
        //     return 0;
        // }
        // int result = nums[0];

        // for(int start=0; start<nums.length; start++){      
        //     int product = 1;
        //     for(int end=start; end<nums.length; end++){
        //         product *= nums[end];
        //         result = Math.max(result, product);
        //     }
        // }

   
        // return result;

        // double passes - one from L-R and the other from R-Ln and record Max

        int result = Integer.MIN_VALUE;

        int product = 1;

        for(int i=0;i<nums.length; i++){
            product *= nums[i];
            result = Math.max(product, result);
            if(product == 0){
                product = 1;
            }
        }

        product = 1;

        for(int i=nums.length-1;i>=0;i--){
            product *= nums[i];
            result = Math.max(product, result);
            if(product == 0){
                product = 1;
            }
        }

        return result;


    }
}