class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        double result = 0.0;

        for(int num : nums1){
            pq.offer(num);
        }

        for(int num : nums2){
            pq.offer(num);
        }

        int[] sorted = new int[pq.size()];
        for(int i=0; i<sorted.length; i++){
            sorted[i] = pq.poll();
        }

        int n = sorted.length;

        if (sorted.length % 2 == 0){
            result = ((double)sorted[n/2] + (double)sorted[n/2 - 1])/2;
        }
        
        else{
            result = (double) sorted[n/2];
        }
        

        return result;
    }
}