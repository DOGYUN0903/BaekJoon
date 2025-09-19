import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int N = numbers.length;
        int max = 0;
        if (numbers[N - 1] * numbers[N - 2] > numbers[0] * numbers[1]){
            max = numbers[N - 1] * numbers[N - 2];
        } else {
            max = numbers[0] * numbers[1];
        }
        return max;
    }
}