class Solution {
    public String solution(int age) {
        String answer = "";
        String strAge = String.valueOf(age);
        
        for(int i = 0; i < strAge.length(); i++){
            int num = strAge.charAt(i) - '0';
            char ch = (char) ('a' + num);
            answer += ch;
        }
        return answer;
    }
}