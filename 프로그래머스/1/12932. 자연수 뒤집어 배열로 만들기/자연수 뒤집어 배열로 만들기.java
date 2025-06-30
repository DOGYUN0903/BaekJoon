class Solution {
    public int[] solution(long n) {
        String num = String.valueOf(n);
        char[] ch = num.toCharArray();
        int[] answer = new int[ch.length];
        for (int i = 0; i < ch.length; i++){
            answer[i] = ch[ch.length - 1 - i] - '0';
        }
        
        return answer;
    }
}