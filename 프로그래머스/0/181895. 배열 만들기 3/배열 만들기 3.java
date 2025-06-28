import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> lists = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++){
            for (int j = intervals[i][0]; j <= intervals[i][1]; j++){
                lists.add(arr[j]);
            }
        }
        
        int[] answer = new int[lists.size()];
        for (int i = 0; i < answer.length; i++){
            answer[i] = lists.get(i);
        }
        return answer;
    }
}