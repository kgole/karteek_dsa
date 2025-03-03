class Solution {
    public int maxSubArrayLen(int[] nums, int k) {

        // 34/37 using simple two pointer approach
        // int result = 0;

        // for(int start=0; start<nums.length; start++){   
        //     int sum = 0;  
        //     for(int end=start; end<nums.length; end++){            
        //         sum = sum + nums[end];
        //         if(sum == k){
        //             result = Math.max(result, end - start + 1);
        //             break;
        //         }
        //     }
        // }

        // return result;

        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            // result = Math.max(i - map.getOrDefault(sum - k, i), result);
            // map.put(sum, map.getOrDefault(sum, i));

            if(sum == k){
                result = i + 1;
            }

            if(map.containsKey(sum - k)){
                result = Math.max(result, i - map.get(sum - k));
            }

            if(!map.containsKey(sum)){
                map.put(sum, i);
            }

        }

        return result;
        

    }
}