import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> lists = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % divisor == 0){
                lists.add(arr[i]);
            }
        }
        if (lists.isEmpty()) return new int[]{-1};
        int[] answer = new int[lists.size()];
        for (int i = 0; i < answer.length; i++){
            answer[i] = lists.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}