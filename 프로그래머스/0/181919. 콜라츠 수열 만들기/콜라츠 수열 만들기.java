import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> lists = new ArrayList<>();
        lists.add(n);
        while (n > 1){
            if (n % 2 == 0){
                n /= 2;
                lists.add(n);
            } else {
                n = 3 * n + 1;
                lists.add(n);
            } 
        }
        
        int[] answer = new int[lists.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = lists.get(i);
        }
        return answer;
    }
}