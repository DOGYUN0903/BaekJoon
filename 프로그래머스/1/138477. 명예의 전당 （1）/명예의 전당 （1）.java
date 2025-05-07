import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> hallOfFame = new ArrayList<>();
        int[] answer = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            hallOfFame.add(score[i]);               
            Collections.sort(hallOfFame);           

            if (hallOfFame.size() > k) {
                hallOfFame.remove(0);               
            }

            answer[i] = hallOfFame.get(0);
        }

        return answer;
    }
}
