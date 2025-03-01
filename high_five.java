class Solution {
    public int[][] highFive(int[][] items) {

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for(int[] item : items){
            int id = item[0];
            int marks = item[1];

            if(!map.containsKey(id)){
                map.put(id, new ArrayList<Integer>());
                map.get(id).add(marks);
            }
            else{
                map.get(id).add(marks);
            }
        }

        ArrayList<List<Integer>> result = new ArrayList<>();

        for(int key : map.keySet()){
            PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
            pq.addAll(map.get(key));
            ArrayList<Integer> cal = new ArrayList<>();

            int ctr = 4;
            int top_total = 0;
            
            while(ctr >= 0){
                top_total += pq.poll();
                ctr--; 
            }

            int avg = top_total / 5;
            cal.add(key);
            cal.add(avg);
            result.add(cal);
        }

        int rows = result.size();
        int cols = result.get(0).size();

        int[][] array2D = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array2D[i][j] = result.get(i).get(j);
            }
        }

        return array2D;
       
    }
}