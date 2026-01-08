import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String[] numStr = new String[numbers.length];
        
        for (int i = 0; i < numbers.length; i++){
            numStr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(numStr, (a, b) -> {
            String ab = a + b;
            String ba = b + a;
            
            return ba.compareTo(ab);
        });
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < numStr.length; i++){
            sb.append(numStr[i]);
        }
        
        if (sb.toString().charAt(0) == '0') {
            return "0";
        }
        
        return sb.toString();
    }
}