class Solution {
    public String solution(int age) {
        // a = 0, b = 1, c = 2
        String answer = "";
        String strAge = String.valueOf(age);
        char[] ch = strAge.toCharArray();
        for (int i = 0; i < ch.length; i++){
            int num = ch[i] - '0';
            answer += (char) ('a'+ num);
        }
        return answer;
    }
}