class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder cleaned = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(!Character.isLetterOrDigit(ch)){
                continue;
            }
            else{
                cleaned.append(Character.toLowerCase(ch));
            }
        }

        // System.out.println(cleaned.toString());

        String cleanedString = cleaned.toString();

        int i=0;
        int j=cleanedString.length() - 1;

        while(i <= j){
            if(cleanedString.charAt(i) != cleanedString.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;

    }
}