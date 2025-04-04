class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        if(arr.length % 2 == 0){
            for(int i = 1; i < arr.length; i = i + 2){
                answer[i] = arr[i] + n;
            }
            for(int j = 0; j < arr.length; j = j + 2){
                answer[j] = arr[j];
            }
        } else {
            for(int i = 0; i < arr.length; i = i + 2){
                answer[i] = arr[i] + n;
            }
            for(int j = 1; j < arr.length; j = j + 2){
                answer[j] = arr[j];
            }
        }
        return answer;
    }
}