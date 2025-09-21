import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for (Integer num : nums){
            set.add(num);
        }
        
        return Math.min(nums.length / 2, set.size());
    }
}