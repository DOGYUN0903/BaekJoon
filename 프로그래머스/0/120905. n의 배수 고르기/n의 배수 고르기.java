import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> lists = new ArrayList<>();
        for (int i = 0; i < numlist.length; i++){
            if (numlist[i] % n == 0){
                lists.add(numlist[i]);
            }
        }
        int[] answer = new int[lists.size()];
        for(int j = 0; j < answer.length; j++){
            answer[j] = lists.get(j);
        }
        return answer;
    }
}