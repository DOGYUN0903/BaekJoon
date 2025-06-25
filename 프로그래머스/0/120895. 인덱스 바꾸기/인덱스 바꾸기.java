class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] ch = my_string.toCharArray();
        
        for(int i = 0; i < ch.length; i++){
            if (i == num1){
                answer += ch[num2];
            } else if(i == num2){
                answer += ch[num1];
            } else {
                answer += ch[i];
            }
        }
        
        return answer;
    }
}