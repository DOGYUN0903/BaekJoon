import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String a = String.valueOf(n);
        char[] array = a.toCharArray();
        for(int i = 0; i < array.length; i++){
            answer += array[i] - '0';
        }

        return answer;
    }
}