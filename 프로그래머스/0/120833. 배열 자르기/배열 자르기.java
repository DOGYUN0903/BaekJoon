import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        List<Integer> num = new ArrayList<>();
        for (int i = num1; i <= num2; i++){
            num.add(numbers[i]);
        }
        
        int[] answer = new int[num.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = num.get(i);
        }
        return answer;
    }
}