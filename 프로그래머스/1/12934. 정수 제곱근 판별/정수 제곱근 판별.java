class Solution {
    public long solution(long n) {
        long answer = -1;
        double num = Math.sqrt(n);
        if (num % 1 == 0){
            answer = (long) ((num + 1) * (num + 1));
        }
        return answer;
    }
}