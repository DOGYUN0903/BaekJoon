class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if (c == ' '){
                answer += c;
            }
            
            else if (c >= 'A' && c <= 'Z'){
                int move = c + n;
                if(move > 'Z'){
                    move = move - 26;
                }
                answer += (char) move;
            }
            
            else if (c >= 'a' && c <= 'z'){
                int move = c + n;
                if (move > 'z'){
                    move = move - 26;
                }
                answer += (char) move;
            }
        }
        
        return answer;
    }
}