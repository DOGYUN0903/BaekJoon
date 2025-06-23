class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] ch = my_string.toCharArray();
        for(int i = 0; i < ch.length; i++){
            answer += ch[ch.length - 1 - i];
        }
        return answer;
    }
}