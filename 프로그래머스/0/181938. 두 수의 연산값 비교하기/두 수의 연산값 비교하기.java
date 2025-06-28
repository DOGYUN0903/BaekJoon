class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int sum1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int sum2 = 2 * a * b;
        if (sum1 > sum2){
            answer = sum1;
        } else if (sum1 < sum2){
            answer = sum2;
        } else {
            answer = sum1;
        }
        return answer;
    }
}