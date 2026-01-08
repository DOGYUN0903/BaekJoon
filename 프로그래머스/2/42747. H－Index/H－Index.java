import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        
        Arrays.sort(citations);
        
        int[] numbers = new int[citations.length];
        
        for (int i = 0; i < citations.length; i++) {
            numbers[i] = citations[citations.length - i - 1];
        }
        
        int answer = 0;
        
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < (i+1)) {
                return i;
            }
        }
        
        return numbers.length;
    }
}