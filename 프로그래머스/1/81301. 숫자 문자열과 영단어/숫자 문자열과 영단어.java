import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String s) {
        Map<String, String> map = new HashMap<>();
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < words.length; i++){
            map.put(words[i], String.valueOf(i));
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length();){
            boolean found = false;
            
            for (String word : map.keySet()) {
                if (s.startsWith(word, i)) {
                    sb.append(map.get(word));
                    i += word.length();
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                sb.append(s.charAt(i));
                i++;
            }
        }
        
        return Integer.parseInt(sb.toString());
    }
}