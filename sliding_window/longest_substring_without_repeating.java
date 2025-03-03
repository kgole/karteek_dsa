class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        // Set<Character> check = new HashSet<>();
        // int max = 0;

        // for(int i=0; i<s.length(); i++){
        //     Character ch = s.charAt(i);
        //     if(!check.contains(ch)){
        //         check.add(ch);
        //     }
        //     else{
        //         max = Math.max(max, check.size());
        //         check.clear();
        //     }
        // }

        // return max;

        
        int start = 0;
        Set<Character> check = new HashSet<>();
        int max = 0;

        for(int end=0; end < s.length(); end++){
            
            if(!check.contains(s.charAt(end))){
                check.add(s.charAt(end));
                max = Math.max(max, end - start + 1);
            }
            else{
                while(check.contains(s.charAt(end))){
                    check.remove(s.charAt(start));
                    start++;
                }
                check.add(s.charAt(end));
            }
        }

        return max;
    }
}