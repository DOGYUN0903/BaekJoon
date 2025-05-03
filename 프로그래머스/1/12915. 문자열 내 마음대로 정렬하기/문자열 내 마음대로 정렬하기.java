import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] mix = new String[strings.length];
        
        for(int i = 0; i < strings.length; i++){
            mix[i] = strings[i].charAt(n) + strings[i];
        }
        
        Arrays.sort(mix);
        
        String[] answer = new String[strings.length];
        for(int i = 0; i < answer.length; i++){
            answer[i] = mix[i].substring(1);
        }
        
        return answer;
    }
}