import java.util.*;

class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        String strNum = "";
        for(int i = 0; i < ch.length; i++){
            strNum += String.valueOf(ch[ch.length - 1 - i]);
        }
        return Long.parseLong(strNum);
    }
}