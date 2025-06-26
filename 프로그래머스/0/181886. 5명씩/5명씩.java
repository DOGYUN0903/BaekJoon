import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        List<String> name = new ArrayList<>();
        for(int i = 0; i < names.length; i = i + 5){
            name.add(names[i]);
        }
        String[] answer = new String[name.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = name.get(i);
        }
        return answer;
    }
}