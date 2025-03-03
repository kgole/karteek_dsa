class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[nums1.length];

        for(int i=0; i<nums2.length-1; i++){
            for(int j=i; j<nums2.length; j++){
                if(nums2[j] > nums2[i]){
                    map.put(nums2[i], nums2[j]);
                    break;
                }
                else{
                    map.put(nums2[i], -1);
                }
            }    
        }
        
        map.put(nums2[nums2.length-1], -1);

        for(int j=0; j<nums1.length; j++){
            if(map.containsKey(nums1[j])){
                int next = map.get(nums1[j]);

                if(next > nums1[j]){
                result[j] = next;
                }
                else{
                    result[j] = -1;
                }
            }    
            
        }

        return result;
        
    }
}