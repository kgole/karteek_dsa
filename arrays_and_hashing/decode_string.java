public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String str : strs){
            // sb.append(str);
            sb.append(str.replace("/", "//")).append("/:");
        }

        // System.out.println(sb.toString());
        return sb.toString();
        
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {

        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while(i < s.length()){
            if(i + 1 < s.length() && s.charAt(i) == '/' && s.charAt(i + 1) == ':'){
                result.add(sb.toString());
                sb = new StringBuilder();
                i = i + 2;
            }

            else if(i + 1 < s.length() && s.charAt(i) == '/' && s.charAt(i + 1) == '/'){
                sb.append('/');
                i = i + 2;
            }

            else{
                sb.append(s.charAt(i));
                i++;
            }
        }

        return result;
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));