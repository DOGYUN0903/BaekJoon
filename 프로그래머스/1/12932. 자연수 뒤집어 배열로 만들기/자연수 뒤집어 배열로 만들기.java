class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        char[] ch = str.toCharArray();
        int[] answer = new int[ch.length];
        for(int i = 0; i < answer.length; i++){
            answer[i] = ch[answer.length - 1 - i] - '0';
        }
        return answer;
    }
}