class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        for (int i = 0; i <= myString.length(); i++){
            String prefix = myString.substring(0, i);
            if (prefix.endsWith(pat)){
                answer = prefix;
            }
        }
        return answer;
    }
}