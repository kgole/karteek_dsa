class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder sString = new StringBuilder();
        StringBuilder rString = new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            char curr = s.charAt(i);
            if(Character.isLetterOrDigit(curr)){
                sString.append(Character.toLowerCase(curr));
            }
        }

        String cleaned = sString.toString();

        int i = 0;
        int j = cleaned.length()-1;

        while(i <= j){
            if(cleaned.charAt(i) != cleaned.charAt(j)){
                return false;
            }

            i++;
            j--;
        }

        return true;
        
    }
}