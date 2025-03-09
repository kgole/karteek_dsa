class Solution {
    public String reformatDate(String date) {

        StringBuilder sb = new StringBuilder();

        String[] split = date.split(" ");

        HashMap<String, String> month_key = new HashMap<>();
        month_key.put("Jan", "01");
        month_key.put("Feb", "02");
        month_key.put("Mar", "03");
        month_key.put("Apr", "04");
        month_key.put("May", "05");
        month_key.put("Jun", "06");
        month_key.put("Jul", "07");
        month_key.put("Aug", "08");
        month_key.put("Sep", "09");
        month_key.put("Oct", "10");
        month_key.put("Nov", "11");
        month_key.put("Dec", "12");


        sb.append(split[2]);
        sb.append("-");
        sb.append(month_key.get(split[1]));
        sb.append("-");

        char[] date_cha_arr = split[0].toCharArray();

        StringBuilder dt = new StringBuilder();

        for(char ch : date_cha_arr){
            
            int ct = 0;
            if(Character.isDigit(ch)){
                dt.append(ch);
                ct++;
            }
        } 

        if(dt.length() == 1){
            dt.insert(0, '0');
        }

        sb.append(dt);
        
        return sb.toString();
        
    }
}