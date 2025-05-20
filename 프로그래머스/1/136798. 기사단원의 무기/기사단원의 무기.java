class Solution {
    public int solution(int number, int limit, int power) {
        int[] divisors = new int[number + 1];
        for (int i = 1; i <= number; i++) {
        int count = 0;
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    count += 2; // j와 i/j
                    if (j * j == i) count--; // 중복 제거
                }
            }
            divisors[i] = count;
        }
        
        int answer = 0;
        for(int i = 0; i < divisors.length; i++){
            if (divisors[i] <= limit){
                answer += divisors[i];
            } else{
                answer += power;
            }
        }
        return answer;
    }
}