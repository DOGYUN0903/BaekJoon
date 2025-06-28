class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] words = binomial.split(" ");
        if (words[1].equals("+")){
            answer = Integer.parseInt(words[0]) + Integer.parseInt(words[2]);
        } else if(words[1].equals("-")){
            answer = Integer.parseInt(words[0]) - Integer.parseInt(words[2]);
        } else {
            answer = Integer.parseInt(words[0]) * Integer.parseInt(words[2]);
        }
        return answer;
    }
}