class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> s_stack = new Stack<>();
        Stack<Character> t_stack = new Stack<>();

        int i = 0;
        int j = 0;

        while(i < s.length()){
            char ss = s.charAt(i);
            if(ss == '#' && !s_stack.isEmpty()){
                s_stack.pop();
            }
            else if(ss != '#'){
                s_stack.push(ss);
            }
            i++;           
        }

        while(j < t.length()){
            char tt = t.charAt(j);
            if(tt == '#' && !t_stack.isEmpty()){
                t_stack.pop();
            }
            else if(tt != '#'){
                t_stack.push(tt);
            }
            j++;
        }

        // System.out.println(s_stack);
        // System.out.println(t_stack);
        

        if(s_stack.equals(t_stack)){
            return true;
        }
        
        return false;
        
    }
}