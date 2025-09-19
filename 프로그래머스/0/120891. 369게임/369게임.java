class Solution {
    public int solution(int order) {
        int answer = 0;
        char[] ch = String.valueOf(order).toCharArray();
        for(int i = 0; i < ch.length; i++){
            if (ch[i] - '0' == 3 || ch[i] - '0' ==6 || ch[i] - '0' == 9){
                answer++;
            }
        }
        return answer;
    }
}