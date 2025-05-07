import java.util.*;

class Solution {
    public long solution(long n) {
        String strNum = String.valueOf(n);
        char[] chNums = strNum.toCharArray();
        Arrays.sort(chNums);
        String result = "";
        for(int i = chNums.length-1; i >= 0; i--){
            result += chNums[i];
        }
        
        return Long.parseLong(result);
    }
}