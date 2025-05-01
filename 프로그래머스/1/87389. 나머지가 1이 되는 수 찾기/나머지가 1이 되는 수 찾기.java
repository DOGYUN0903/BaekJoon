import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>(); // 나머지가 1이 되는 수가 몇개가 나올지 모르니까 List 사용
        for(int i = 1; i <= n; i++){
            if (n % i == 1){
                list.add(i);
            }
        }
        int[] arr = new int[list.size()]; // 리스트의 사이즈로 배열의 크기 파악 가능
        for(int j = 0; j < list.size(); j++){
            arr[j] = list.get(j);
        }
        Arrays.sort(arr); //배열을 오름차순으로 정렬해줍니다.
        answer = arr[0]; // 맨 처음 값이 최솟값이다.
        return answer;
    }
}