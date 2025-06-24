import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        List<Integer> lists = new ArrayList<>();
        for (int i = num1; i <= num2; i++){
            lists.add(numbers[i]);
        }
        int[] answer = new int[lists.size()];
        for (int i = 0; i < answer.length; i++){
            answer[i] = lists.get(i);
        }
        return answer;
    }
}