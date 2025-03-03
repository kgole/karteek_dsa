class Solution {
    public String reversePrefix(String word, char ch) {

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int flag = 0;

        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) != ch && flag == 0){
                stack.push(word.charAt(i));
            }
            else if(word.charAt(i) == ch && flag == 0){
                sb.append(ch);
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                flag = 1;
            }
            else{
                sb.append(word.charAt(i));
            }
        }

        if(flag == 0){
            return word;
        }

        return sb.toString();
      
    }
}