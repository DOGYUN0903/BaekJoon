import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int n = score.length;
        
        // 점수가 높은 과일부터 m개씩 묶는다
        // 가장 끝(높은 점수)부터 m개씩 뒤에서 앞으로 이동
        // 총 과일 개수에서 m씩 빼가며 그룹 생성
        for(int i = n - m; i >= 0; i -= m){
            answer += score[i] * m;
        }
        
        return answer;
    }
}

// 사과 상태 1점 ~ k점
// k점은 최상품
// 1점은 최하품
// 한상자에 m개씩
// 가장 낮은 점수가 p점일때, 사과 한 상자의 가격 = m * p
