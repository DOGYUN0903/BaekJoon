import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> strs = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++){
            if (!strArr[i].contains("ad")){
                strs.add(strArr[i]);
            }
        }
        
        String[] answer = new String[strs.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = strs.get(i);
        }
        return answer;
    }
}