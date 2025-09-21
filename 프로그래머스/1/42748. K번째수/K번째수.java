import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < answer.length; i++){     
            List<Integer> lists = new ArrayList<>();
            for (int j = commands[i][0] - 1; j <= commands[i][1] - 1; j++){
                lists.add(array[j]);              
            }
            
            int[] temp = new int[lists.size()];     
            for (int k = 0; k < temp.length; k++){
                temp[k] = lists.get(k);                
            }
            Arrays.sort(temp);
            
            answer[i] = temp[commands[i][2] - 1];
        }
        
        return answer;
    }
}