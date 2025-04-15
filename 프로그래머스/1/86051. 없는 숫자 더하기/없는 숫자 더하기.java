class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        int sum = 0;
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(numbers[i] == arr[j]){
                    sum += numbers[i];
                }
            }
        }
        answer -= sum;
        return answer;
    }
}