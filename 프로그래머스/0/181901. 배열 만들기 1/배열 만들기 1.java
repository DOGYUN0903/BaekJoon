import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        List<Integer> lists = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if (i % k == 0){
                lists.add(i);
            }
        }
        int[] answer = new int[lists.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = lists.get(i);
        }
        return answer;
    }
}