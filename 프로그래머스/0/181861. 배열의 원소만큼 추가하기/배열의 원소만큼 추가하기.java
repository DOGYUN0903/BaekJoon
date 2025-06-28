import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> lists = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i]; j++){
                lists.add(arr[i]);
            }
        }
        
        int[] answer = new int[lists.size()];
        for (int i = 0; i < answer.length; i++){
            answer[i] = lists.get(i);
        }
        return answer;
    }
}