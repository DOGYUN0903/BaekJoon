class Solution {
    public int solution(int order) {
        int answer = 0;
        String num = String.valueOf(order);
        char[] ch = num.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if ((ch[i] - '0') == 3){
                answer++;
            } else if ((ch[i] - '0') == 6) {
                answer++;
            } else if ((ch[i] - '0') == 9){
                answer++;
            }
        }
        return answer;
    }
}