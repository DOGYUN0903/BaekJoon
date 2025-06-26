class Solution {
    public int solution(int n, String control) {
        int answer = n;
        String[] words = control.split("");
        for(int i = 0; i < words.length; i++){
            if (words[i].equals("w")){
                answer += 1;
            } else if (words[i].equals("s")){
                answer += -1;
            } else if (words[i].equals("d")){
                answer += 10;
            } else if (words[i].equals("a")){
                answer += -10;
            }
        }
        return answer;
    }
}