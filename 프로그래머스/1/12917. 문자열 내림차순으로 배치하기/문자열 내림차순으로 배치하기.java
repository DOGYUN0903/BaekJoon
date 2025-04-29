import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for(int i = 0; i < ch.length; i++){
            answer += String.valueOf(ch[ch.length - 1 - i]);
        }
        return answer;
    }
}