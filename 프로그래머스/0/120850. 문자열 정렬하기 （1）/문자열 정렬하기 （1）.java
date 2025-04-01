import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            // 숫자인지 확인 (문자 '0' ~ '9')
            if (Character.isDigit(c)) {
                list.add(c - '0'); // 문자 3 → 숫자 3으로 변환
            }
        }
        
        // 정렬
        Collections.sort(list);

        // List → 배열로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
