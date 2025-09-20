import java.util.*;

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String kStr = String.valueOf(k);
        
        for (int z = i; z <= j; z++){
            String num = String.valueOf(z);
            
            for (char c : num.toCharArray()){
                if (c == kStr.charAt(0)){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}