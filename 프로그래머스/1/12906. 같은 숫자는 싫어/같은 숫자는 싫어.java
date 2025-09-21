import java.util.Deque;
import java.util.ArrayDeque;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> dq = new ArrayDeque<>();
        
        for (int num : arr){
            if (dq.isEmpty() || dq.peek() != num){
                dq.push(num);
            }
        }
        
        int[] answer = new int[dq.size()];

        for(int i = answer.length -1 ; i >= 0; i--){
            answer[i] = dq.pop();
        }
        
        return answer;
    }
}