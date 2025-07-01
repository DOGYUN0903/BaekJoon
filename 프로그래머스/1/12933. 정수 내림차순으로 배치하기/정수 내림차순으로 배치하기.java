import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String num = String.valueOf(n);
        char[] numChar = num.toCharArray();
        Arrays.sort(numChar);
        String newNum = "";
        for(int i = 0; i < numChar.length; i++){
            newNum += numChar[numChar.length - 1 - i];
        }
        return Long.parseLong(newNum);
    }
}