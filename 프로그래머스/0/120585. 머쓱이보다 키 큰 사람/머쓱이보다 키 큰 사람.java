import java.util.*;

class Solution {
    public int solution(int[] array, int height) {
        List<Integer> friends = new ArrayList<>();
        for(int i = 0; i < array.length; i++){
            if (array[i] > height){
                friends.add(array[i]);
            }
        }
        
        return friends.size();
    }
}