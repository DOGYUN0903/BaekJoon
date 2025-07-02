import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> lists = new ArrayList<>();
        for (String str : intStrs){
            String sub = str.substring(s, s + l);
            int num = Integer.parseInt(sub);
            
            if (num > k){
                lists.add(num);
            }
        }
        int[] answer = new int[lists.size()];
        for (int i = 0; i < answer.length; i++){
            answer[i] = lists.get(i);
        }
        return answer;
    }
}