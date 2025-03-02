class Solution {
    public boolean canJump(int[] nums) {

        // 2 3 1 1 4
        // 0 1 2 3 4

        int maxJump = 0;
        int target = nums.length - 1;
        
        for(int i=0;i<nums.length;i++){
            //maxJump = i;     
            // maxJump = nums[i];
            // for(int j=1;j<=maxJump;j++){
            //     maxJump += j;
            // }
            // if (maxJump >= target){
            //     return true;
            // }
            if(maxJump < i){
                return false;
            }

            maxJump = Math.max(maxJump, i+nums[i]);

            if(maxJump >= target){
                return true;
            }

        }

        // System.out.println(maxJump);
        

        return true;
        
    }
}