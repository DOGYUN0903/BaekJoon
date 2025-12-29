class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String str = String.valueOf(x);
        char[] arr = str.toCharArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i] - '0';
        }
        
        if (x % sum == 0){
            return answer;
        }
        
        return false;
    }
}