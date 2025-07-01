import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> lists = new ArrayList<>();

        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    lists.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    if (!lists.isEmpty()) {
                        lists.remove(lists.size() - 1);
                    }
                }
            }
        }

        int[] answer = new int[lists.size()];
        for (int i = 0; i < lists.size(); i++) {
            answer[i] = lists.get(i);
        }

        return answer;
    }
}