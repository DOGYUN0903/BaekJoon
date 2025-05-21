import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        int len = nums.length / 2;
        Set<Integer> poketmon = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++){
            poketmon.add(nums[i]);
        }
        
        return Math.min(poketmon.size(), len);
    }
}