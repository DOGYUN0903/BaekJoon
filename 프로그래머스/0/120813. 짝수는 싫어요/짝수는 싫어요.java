import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> lists = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if (i % 2 != 0){
                lists.add(i);
            }
        }
        int[] answer = new int[lists.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = lists.get(i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}