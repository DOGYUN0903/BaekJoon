class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] c = my_string.toCharArray();
        
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j <= 9; j++){
                if (c[i] - '0' == j){
                    answer += j;
                }
            }
        }
        return answer;
    }
}