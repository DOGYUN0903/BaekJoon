class Solution {
    public String solution(String my_string) {
        String answer1 = my_string.replace("a", "");
        String answer2 = answer1.replace("e", "");
        String answer3 = answer2.replace("i", "");
        String answer4 = answer3.replace("o", "");
        String answer5 = answer4.replace("u", "");        
        return answer5;
    }
}