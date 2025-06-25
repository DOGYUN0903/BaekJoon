class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        char[] ch = cipher.toCharArray();
        for (int i = code - 1; i < ch.length; i = i + code){
            answer += ch[i];
        }
        return answer;
    }
}