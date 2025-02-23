class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        // brute force
        // int[] result = new int[temperatures.length];
        // Stack<Integer> stack = new Stack<>();

        // for(int i=0; i<temperatures.length-1;i++){
        //     int ctr = 0;

        //     for(int j=i; j<temperatures.length; j++){
        //         int current = temperatures[j];
        //         if(stack.isEmpty() || stack.peek() < current){
        //             stack.push(current);
        //             ctr++;              
        //             break;
        //         }
        //         else{
        //             ctr++;
        //         }
        //     }
        //     result[i] = ctr;
        // }
        // return result;

        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                result[idx] = i - idx;
            }
            stack.push(i);
        }

        return result;  


    }
}