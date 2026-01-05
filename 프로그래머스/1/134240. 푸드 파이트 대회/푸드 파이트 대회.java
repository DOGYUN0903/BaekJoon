
// 1대1로 대결
// 매 대결마다 음식의 종류와 양이 바뀜
// 한 선수는 제일 왼쪽부터 오른쪽으로, 다른 선수는 제일 오른쪽부터 왼쪽으로(중앙에는 물이 있고, 물을 먼저 먹는 선수가 승리)
// 두 선수가 먹는 음식의 종류와 양이 같아야함
// 음식을 먹는 순서도 같아야함

class Solution {
    public String solution(int[] food) {
        StringBuilder left = new StringBuilder();

        for (int i = 1; i < food.length; i++){
            int count = food[i] / 2;
            for (int j = 0; j < count; j++){
                left.append(i);
            }
        }
        
        String leftStr = left.toString();
        String rightStr = left.reverse().toString();
        return leftStr + "0" + rightStr;
    }
}