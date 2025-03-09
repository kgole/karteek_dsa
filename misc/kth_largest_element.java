class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for(int i : nums){
            maxHeap.offer(i);
        }

        int i = 1;
        while(i < k){
            maxHeap.poll();
            i++;
        }


        return maxHeap.peek();
        
    }
}