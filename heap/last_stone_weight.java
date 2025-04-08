class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        

        for(int n : stones){
            pq.offer(n);
        }

        while(pq.size() != 1){
            int one = pq.poll();
            int two = pq.poll();
        
            int three = one - two;
            pq.offer(three);
        }

        

        return pq.peek();
    }
}