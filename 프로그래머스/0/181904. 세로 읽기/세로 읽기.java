class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";

        int rows = my_string.length() / m;

        for (int i = 0; i < rows; i++) {
            // 각 줄의 시작 인덱스 = i * m
            // c번째 열의 인덱스는 (i * m) + (c - 1)
            answer += my_string.charAt(i * m + (c - 1));
        }

        return answer;
    }
}