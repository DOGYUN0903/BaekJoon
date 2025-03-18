class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int count = n/10;
        answer = 12000*n + 2000*k-count*2000;
        
        return answer;
    }
}