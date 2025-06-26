import java.util.*;

class Solution {
    public int[] solution(int start_num, int end_num) {
        List<Integer> lists = new ArrayList<>();
        for(int i = start_num; i >= end_num; i--){
            lists.add(i);
        }
        
        int[] answer = new int[lists.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = lists.get(i);
        }
        return answer;
    }
}