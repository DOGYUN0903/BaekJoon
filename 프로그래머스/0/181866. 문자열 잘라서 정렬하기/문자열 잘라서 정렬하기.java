import java.util.*;

class Solution {
    public String[] solution(String myString) {
        List<String> lists = new ArrayList<>();
        String[] words = myString.split("x");
        for (int i = 0; i < words.length; i++){
            if (!words[i].equals("")){
                lists.add(words[i]);
            }
        }
        
        String[] answer = new String[lists.size()];
        lists.toArray(answer);
        Arrays.sort(answer);
        
        return answer;
    }
}