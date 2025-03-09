class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {

        long result = 0;
        PriorityQueue<Integer> max_candidates = new PriorityQueue<>((a, b) -> b - a);

        for(int i=0; i<grid.length; i++){
            PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
            
            for(int j : grid[i]){
                pq.offer(j);
            }

            int l = 0;
            while(l < limits[i]){
                max_candidates.offer(pq.poll());
                l++;
            }

        }

        int m = 0;
        while(m < k){
            result += max_candidates.poll();
            m++;
        }

        return result;
        
    }
}