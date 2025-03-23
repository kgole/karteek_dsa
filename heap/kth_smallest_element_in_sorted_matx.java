class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int[] arr : matrix){
            for(int n : arr){
                pq.add(n);
            }
        }

        if(pq.size() < k){
            return -1;
        }

        int i = 1;
        while(i < k){
            pq.poll();
            i++;
        }

        return pq.peek();

    }
}