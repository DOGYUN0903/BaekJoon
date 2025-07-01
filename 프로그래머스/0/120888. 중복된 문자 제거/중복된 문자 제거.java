class Solution {
    public String solution(String my_string) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            boolean isDuplicate = false;

            // 이미 answer에 있는 문자면 중복
            for (int j = 0; j < answer.length(); j++) {
                if (ch == answer.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                answer += ch;
            }
        }

        return answer;
    }
}