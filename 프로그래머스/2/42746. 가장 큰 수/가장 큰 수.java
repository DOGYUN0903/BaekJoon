import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        
        String[] str = new String[numbers.length];
        for (int i = 0; i < str.length; i++){
            str[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });
        
        StringBuilder sb = new StringBuilder();
        for (String s : str){
            sb.append(s);
        }
        
        if (sb.toString().charAt(0) == '0') {
            return "0";
        }
        
        return sb.toString();
    }
}