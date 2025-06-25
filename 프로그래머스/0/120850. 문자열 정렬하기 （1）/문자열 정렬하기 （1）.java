import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> lists = new ArrayList<>();
        char[] ch = my_string.toCharArray();
        for (char c : ch){
            if (c >= '0' && c <= '9'){
                lists.add(c - '0');
            }
        }
        int[] answer = new int[lists.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = lists.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}