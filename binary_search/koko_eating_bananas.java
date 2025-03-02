class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int min_banana_ph = 1;
        int max_banana_ph = 1;


        for(int i=0;i<piles.length;i++){
            max_banana_ph = Math.max(max_banana_ph, piles[i]);
        }

        while(min_banana_ph < max_banana_ph){

            int mid_banana_ph = (min_banana_ph + max_banana_ph) / 2;

            int hours_spent = 0;

            for(int i=0; i<piles.length;i++){
                // hours_spent += piles[i] / mid_banana_ph;
                hours_spent += Math.ceil((double) piles[i] / mid_banana_ph);
            }

            if(hours_spent <= h){
                max_banana_ph = mid_banana_ph;
            }
            else{
                min_banana_ph = mid_banana_ph + 1;
            }
        }

        return max_banana_ph;
        
    }
}