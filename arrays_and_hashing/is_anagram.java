class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            if(!sMap.containsKey(s.charAt(i))){
                sMap.put(s.charAt(i), 1);
            }
            else{
                sMap.put(s.charAt(i), sMap.get(s.charAt(i))  + 1);
            }

            if(!tMap.containsKey(t.charAt(i))){
                tMap.put(t.charAt(i), 1);
            }
            else{
                tMap.put(t.charAt(i), tMap.get(t.charAt(i)) + 1);
            }
        }

        // System.out.println(sMap);
        // System.out.println(tMap);
        
        if(sMap.equals(tMap)){
            return true;
        }

        // for(int i=0; i<s.length(); i++){
        //     Character check = s.charAt(i);
        //     if(sMap.get(check) != tMap.get(check)){
        //         return false;
        //     }
        // }


        return false;
    }
}