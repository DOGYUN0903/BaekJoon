class Solution {
    public int solution(int n, int k) {
        if (n < 10) return 12_000*n + 2_000*k;
        return 12_000*n + 2_000*k - n/10*2000;
    }
}