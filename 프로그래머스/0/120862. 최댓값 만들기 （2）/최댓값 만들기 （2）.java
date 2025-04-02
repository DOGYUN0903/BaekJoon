import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        
        int n = numbers.length;
        int case1 = numbers[n - 1] * numbers[n - 2];
        int case2 = numbers[0] * numbers[1];

        int answer;
        if (case1 > case2) {
            answer = case1;
        } else {
            answer = case2;
        }
        return answer;
    }
}