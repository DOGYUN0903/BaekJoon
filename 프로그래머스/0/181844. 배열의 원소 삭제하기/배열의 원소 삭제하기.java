import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> lists = new ArrayList<>();
        Set<Integer> sets = new HashSet<>();
        
        for(int num : delete_list){
            sets.add(num);
        }
        
        for(int num : arr){
            if (!sets.contains(num)){
                lists.add(num);
            }
        }
        
        int[] answer = new int[lists.size()];
        for(int k = 0; k < answer.length; k++){
            answer[k] = lists.get(k);
        }
        return answer;
    }
}