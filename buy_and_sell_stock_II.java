class Solution {
    public int maxProfit(int[] prices) {
        
        // 0, -6, -2, -4, -1, -3 max = 0 - d1
        // 0, 4, 2, 5, 3 max = 5 - d2
        // 0, -2, 1, -1 max = 1 - d3
        // 0, 3, 1 max = 3 - d4
        // 0, -2 max = 0 - d5
        // 0 max = 0 -d6

        // [0, 5, 1, 3, 0, 0]
        // [0, -6, 4, -2, 3, -2, 0]

        int result = 0;

        for(int i=1; i<prices.length; i++){
            if(prices[i] > prices[i-1]){
                result += (prices[i] - prices[i-1]);
            }
        }

        return result;

    }
}