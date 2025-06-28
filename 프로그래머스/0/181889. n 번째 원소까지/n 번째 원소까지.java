import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> lists = new ArrayList<>();
        for (int i = 0; i < n; i++){
            lists.add(num_list[i]);
        }
        
        int[] answer = new int[lists.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = lists.get(i);
        }
        return answer;
    }
}