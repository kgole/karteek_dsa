class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> result = new HashMap<>();
        
        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String current = new String(chars);
            if(!result.containsKey(current)){
                result.put(current, new ArrayList<>());
            }
            result.get(current).add(s);
        }

        return new ArrayList<>(result.values());

    }
}