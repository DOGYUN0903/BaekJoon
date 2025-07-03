import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> lenMap = new HashMap<>();
        for (String s : strArr){
            int len = s.length();
            if (lenMap.containsKey(len)){
                int currentCount = lenMap.get(len); // 이미 있는 개수
                lenMap.put(len, currentCount + 1); 
            } else {
                lenMap.put(len, 1);
            }
        }
        
        int answer = 0;
        for (int count : lenMap.values()){
            answer = Math.max(answer, count);
        }
        return answer;
    }
}