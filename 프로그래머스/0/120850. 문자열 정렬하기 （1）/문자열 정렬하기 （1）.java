import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> lists = new ArrayList<>();
        char[] c = my_string.toCharArray();
        
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j <= 9; j++){
                if (c[i] - '0' == j){
                    lists.add(j);
                }
            }
        }
        
        int[] answer = new int[lists.size()];
        for (int k = 0; k < answer.length; k++){
            answer[k] = lists.get(k);
        }
        Arrays.sort(answer);
        return answer;
    }
}