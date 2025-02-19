class Solution {
    public String reverseWords(String s) {

        String[] ss = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i=ss.length-1; i>=0; i--){
            if(ss[i] == " " || ss[i].isEmpty()){
                continue;
            }
            else{
                sb.append(ss[i]);
                sb.append(" ");
            }
            
        }

        return sb.toString().strip();
        
    }
}