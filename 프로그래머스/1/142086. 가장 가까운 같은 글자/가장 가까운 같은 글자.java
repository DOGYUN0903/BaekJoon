import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> index = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (index.containsKey(c)) {
                answer[i] = i - index.get(c);
            } else {
                answer[i] = -1;
            }
            
            index.put(c, i);
        }
        
        return answer;
    }
}