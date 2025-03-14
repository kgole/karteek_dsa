class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int result = 0;

        for(int start=0; start<nums.length; start++){
            int sum = 0;
            for(int end = start; end<nums.length; end++){
                sum+= nums[end];

                if(sum == k){
                    result++;
                }
            }
        }

        return result;
    }
}