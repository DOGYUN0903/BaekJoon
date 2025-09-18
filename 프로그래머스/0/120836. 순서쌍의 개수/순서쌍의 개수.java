import java.util.*;

class Solution {
    public int solution(int n) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                nums.add(i);
            }
        }
        
        return nums.size();
    }
}