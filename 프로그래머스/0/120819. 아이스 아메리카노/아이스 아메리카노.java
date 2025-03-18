class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int americano_count = money/5500;
        int last_money = money%5500;
        answer[0] = americano_count;
        answer[1] = last_money;
        return answer;
    }
}