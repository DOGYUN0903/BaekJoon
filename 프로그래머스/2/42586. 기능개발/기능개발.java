import java.util.Deque;
import java.util.ArrayDeque;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Deque<Integer> dq = new ArrayDeque<>();
        
        for (int i = 0; i < progresses.length; i++){
            int remain = 100 - progresses[i];
            int days = (int) Math.ceil((double) remain / speeds[i]);
            
            dq.offer(days);
        }
        
        List<Integer> result = new ArrayList<>();
        
        while(!dq.isEmpty()){
            int firstDay = dq.poll();
            int count = 1;
            
            while (!dq.isEmpty() && dq.peek() <= firstDay){
                dq.poll();
                count++;
            }
            
            result.add(count);
        }
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}