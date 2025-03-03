class Solution {
    public int romanToInt(String s) {

        HashMap<Character, Integer> lookup = new HashMap<>();
        lookup.put('I', 1);
        lookup.put('V', 5);
        lookup.put('X', 10);
        lookup.put('L', 50);
        lookup.put('C', 100);
        lookup.put('D', 500);
        lookup.put('M', 1000);

        int sum = 0;

        for(int i=0; i<s.length()-1; i++){
            if(lookup.get(s.charAt(i)) < lookup.get(s.charAt(i+1))){
                sum -= lookup.get(s.charAt(i));
            }
            else{
                sum += lookup.get(s.charAt(i));
            }
        }

        return sum+lookup.get(s.charAt(s.length()-1));
        
        
    }
}