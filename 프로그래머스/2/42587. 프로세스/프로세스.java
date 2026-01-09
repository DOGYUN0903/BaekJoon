import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public int solution(int[] priorities, int location) {
        Deque<int[]> deque = new ArrayDeque<>();
        
        for (int i = 0; i < priorities.length; i++) {
            deque.offer(new int[]{priorities[i], i});
        }

        // 몇 번째 실행인지 카운트
        int count = 0;
        
        while (!deque.isEmpty()) {
            int[] current = deque.poll();
            
            boolean hasHigher = false;
            for (int[] process : deque) {
                if (process[0] > current[0]) {
                    hasHigher = true;
                    break;
                }
            }
            
            if (hasHigher) {
                deque.offer(current);
            } else {
                count++;
                if (current[1] == location) {
                    return count;
                }
            }
        }
        
        int answer = 0;
        return answer;
    }
}