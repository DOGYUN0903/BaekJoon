class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for (int z = i; z <= j; z++){
            String numZ = String.valueOf(z);
            for (int p = 0; p < numZ.length(); p++){
                if (numZ.charAt(p) - '0' == k){
                    answer++;
                }
            }
        }
        return answer;
    }
}