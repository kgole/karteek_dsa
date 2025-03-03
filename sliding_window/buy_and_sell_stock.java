class Solution {
    public int maxProfit(int[] prices) {

        // brute force
        // int result = 0;

        // for(int i=0; i<prices.length-1; i++){
        //     for(int j=i+1; j<prices.length; j++){
        //         if(prices[i] < prices[j]){
        //             result = Math.max(result, prices[j] - prices[i]);
        //         }
        //     }
        // }
        
        // return result;

        int result = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<prices.length;i++){

            min = Math.min(prices[i], min);

            if(prices[i] - min > result){
                result = prices[i] - min;
            }
            
        }

        return result;
        
    }
}