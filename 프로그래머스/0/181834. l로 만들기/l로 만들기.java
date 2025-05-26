class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();
        char[] words = myString.toCharArray();
        for(int i = 0; i < words.length; i++){
            if (words[i] < 'l'){
                answer.append('l');
            } else{
                answer.append(words[i]);
            }
        }
        return answer.toString();
    }
}