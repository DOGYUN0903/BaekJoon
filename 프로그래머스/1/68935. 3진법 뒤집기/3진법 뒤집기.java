class Solution {
    public int solution(int n) {
        String answer = "";
        
        while (n > 0) {
            answer += (n % 3); //0021
            n /= 3;
        }

        int result = 0;
        int power = 1; 

        for (int i = answer.length() - 1; i >= 0; i--) {
            int digit = answer.charAt(i) - '0';
            result += digit * power;
            power *= 3;
        }

        return result;
    }
}
