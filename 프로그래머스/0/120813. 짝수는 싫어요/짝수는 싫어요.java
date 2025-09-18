import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> lists = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            if (i % 2 != 0){
                lists.add(i);
            }
        }
        
        int[] answer = new int[lists.size()];
        for (int j = 0; j < answer.length; j++){
            answer[j] = lists.get(j);
        }
        
        return answer;
    }
}