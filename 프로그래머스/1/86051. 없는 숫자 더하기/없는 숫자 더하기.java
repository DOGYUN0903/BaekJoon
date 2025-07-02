class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i <= 9; i++){
            for (int j = 0; j < numbers.length; j++){
                if (numbers[j] == i){
                    sum += i;
                }
            }
        }
        return 45 - sum;
    }
}