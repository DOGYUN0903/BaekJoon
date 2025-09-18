class Solution {
    public int solution(int n) {
        String nums = n + "";
        char[] chars = nums.toCharArray();
        int sum = 0;
        for(int i = 0; i < chars.length; i++){
            sum += chars[i] - '0';
        }
        return sum;
    }
}