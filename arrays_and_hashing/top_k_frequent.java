class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> freq = new HashMap<>();
        int[] result = new int[k]; 

        if(nums.length == k){
            return nums;
        }

        int highest = 0; 

        for(int i=0; i<nums.length; i++){
            
            if(!freq.containsKey(nums[i])){
                freq.put(nums[i], 1);
            }
            else{
                freq.put(nums[i], freq.get(nums[i]) + 1);
            }

            highest = Math.max(highest, freq.get(nums[i]));
        }


        int i = 0;
        while(i < k){
            for(int key : freq.keySet()){
                if(freq.get(key) == highest){
                    result[i] = key;
                    i++;
                }
            }
            highest--;
        }

        
        return result;


    }
}