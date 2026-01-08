import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] remainDay = new int[progresses.length];
        
        for (int i = 0; i < progresses.length; i++) {
            remainDay[i] = (int) Math.ceil((double)(100 - progresses[i]) / speeds[i]);
        }
        
        List<Integer> result = new ArrayList<>();
        int standard = remainDay[0];
        int count = 1;
        
        for (int i = 1; i < remainDay.length; i++) {
            if (remainDay[i] <= standard) {
                count++;
            } else {
                result.add(count);
                count = 1;
                standard = remainDay[i];
            }
        }
        
        result.add(count);
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}