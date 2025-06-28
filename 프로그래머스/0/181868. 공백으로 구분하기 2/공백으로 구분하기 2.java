import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] words = my_string.split(" ");
        List<String> lists = new ArrayList<>();        
        
        for (int i = 0; i< words.length; i++){
            if (words[i].length() != 0){
                lists.add(words[i]);
            }
        }
        
        String[] answer = new String[lists.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = lists.get(i);
        }
        return answer;
    }
}