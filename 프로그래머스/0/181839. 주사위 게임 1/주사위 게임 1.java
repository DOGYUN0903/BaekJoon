class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if (a % 2 == 0 && b % 2 == 0){
            answer = Math.abs(a-b);
        } else if (a % 2 == 0 || b % 2 == 0){
            if (a % 2 == 0 && b % 2 == 0){
                answer = Math.abs(a-b);
            } else {
                answer = 2 * (a + b);
            }
        } else {
            answer = a*a + b*b;
        }
        return answer;
    }
}