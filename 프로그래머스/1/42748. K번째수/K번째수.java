import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int a = 0; a < commands.length; a++){
            int i = commands[a][0] - 1;
            int j = commands[a][1] - 1;
            int k = commands[a][2] - 1;
            
            int[] arr = new int[j - i + 1];
            
            for(int b = i; b <= j; b++){
                arr[b-i] = array[b];
            }
            
            Arrays.sort(arr);
            
            answer[a] = arr[k];
        }
        return answer;
    }
}