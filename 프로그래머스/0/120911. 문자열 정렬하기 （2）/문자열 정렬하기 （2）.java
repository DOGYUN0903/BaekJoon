import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        
        char[] ch = my_string.toCharArray();
        
        for (int i = 0; i < ch.length; i++){
            sb.append(Character.toLowerCase(ch[i]));
        }
        
        String st = sb.toString();
        char[] c = st.toCharArray();
        Arrays.sort(c);
        
        return String.valueOf(c);
    }
}