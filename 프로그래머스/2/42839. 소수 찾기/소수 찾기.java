import java.util.Set;
import java.util.HashSet;

class Solution {
    Set<Integer> cNum = new HashSet<>();
    
    public int solution(String numbers) {
        
        makeNumbers("", numbers);
        
        int answer = 0;
        for (int num : cNum) {
            if (isPrime(num)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private void makeNumbers(String current, String others) {
        if (!current.equals("")) {
            cNum.add(Integer.parseInt(current));
        }
        
        for (int i = 0; i < others.length(); i++) {
            makeNumbers(
                current + others.charAt(i),
                others.substring(0, i) + others.substring(i + 1)
            );
        }
    }
    
    private boolean isPrime(int n) {
        if (n < 2) return false;
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        
        return true;
    }
}