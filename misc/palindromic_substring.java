class Solution {
    public int countSubstrings(String s) {
        
        // Set<String> set = new HashSet<>();
        int result = 0;
        
        for(int start=0; start<s.length(); start++){
            for(int end=start; end<s.length(); end++){
                String ss = s.substring(start, end + 1);
                //System.out.println(ss);
                int left = 0;
                int right = ss.length()-1;
                int flag = 0;
                
                while(left <= right){
                    if(ss.charAt(left) != ss.charAt(right)){
                        flag = 1;
                        break;
                    }
                    left++;
                    right--;
                }
                
                if(flag != 1){
                    result++;
                }
            }
        }

        return result;
    }
}