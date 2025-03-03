class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> openings = new HashMap<Character, Character>();
        
        openings.put('(', ')');
        openings.put('[', ']');
        openings.put('{', '}');
        
        
        Stack<Character> stack = new Stack<Character>();
        
        for(int i=0;i<s.length();i++){

            char ch = s.charAt(i);
            if(openings.containsKey(ch)){
                stack.push(openings.get(ch));
            }
            
            else if(stack.isEmpty() || stack.pop() != ch){
                return false;
            }
            
            
        }
        
        return stack.isEmpty();
    }
}