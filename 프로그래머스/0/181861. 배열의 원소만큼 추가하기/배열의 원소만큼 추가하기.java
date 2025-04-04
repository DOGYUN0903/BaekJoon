import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i]; j++){
                answer.add(arr[i]);
            }
        }
        
        int[] result = new int[answer.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = answer.get(i);
        }
        return result;
    }
}