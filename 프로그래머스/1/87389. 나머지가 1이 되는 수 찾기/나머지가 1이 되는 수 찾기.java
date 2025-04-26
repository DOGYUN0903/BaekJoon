import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if (n % i == 1){
                list.add(i);
            }
        }
        int[] arr = new int[list.size()];
        for(int j = 0; j < list.size(); j++){
            arr[j] = list.get(j);
        }
        Arrays.sort(arr);
        answer = arr[0];
        return answer;
    }
}