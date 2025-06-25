import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> lists = new ArrayList<>();
        for(int i = 0; i < todo_list.length; i++){
            if (finished[i] == false) {
                lists.add(todo_list[i]);
            }
        }
        String[] answer = new String[lists.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = lists.get(i);
        }
        return answer;
    }
}