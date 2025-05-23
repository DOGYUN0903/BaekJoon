class Solution {
    public int solution(int n) {
        // 소수가 아닌 수를 표시할 배열
        boolean[] isNotPrime = new boolean[n + 1];
        
        // 0과 1은 소수가 아니므로 true
        isNotPrime[0] = true;
        isNotPrime[1] = true;
        
        for (int i = 2; i * i <= n; i++) {
            // i가 아직 소수인 경우 (false일 때만 처리)
            if (!isNotPrime[i]) {
                // i의 배수들을 모두 소수가 아님으로 표시 (j는 i*i부터 시작)
                for (int j = i * i; j <= n; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
        
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (!isNotPrime[i]) count++; // 소수이면 카운트 증가
        }

        return count;
    }
}