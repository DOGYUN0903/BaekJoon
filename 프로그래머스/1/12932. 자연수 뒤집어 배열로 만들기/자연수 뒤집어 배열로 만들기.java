class Solution {
    public int[] solution(long n) {        
        String str = String.valueOf(n);
        char[] arr = str.toCharArray();
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            answer[arr.length - i - 1] = arr[i] - '0';
        }
        
        return answer;
    }
}