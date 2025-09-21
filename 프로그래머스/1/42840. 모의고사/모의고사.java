import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] num1 = {1,2,3,4,5};
        int[] num2 = {2,1,2,3,2,4,2,5};
        int[] num3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] scores = new int[3];
        
        for (int i = 0; i < answers.length; i++){
            if(answers[i] == num1[i % num1.length]) {
                scores[0]++;
            }
            
            if(answers[i] == num2[i % num2.length]) {
                scores[1]++;
            }
            
            if(answers[i] == num3[i % num3.length]) {
                scores[2]++;
            }
        }
        
        int high = 0;
        for (int score : scores){
            high = Math.max(high, score);
        }
        
        List<Integer> lists = new ArrayList<>();
        
        for (int i = 0; i < scores.length; i++){
            if (scores[i] == high){
                lists.add(i + 1);
            }
        }
    
        int[] answer = new int[lists.size()];
        for (int i = 0; i < answer.length; i++){
            answer[i] = lists.get(i);
        }
        return answer;
    }
}