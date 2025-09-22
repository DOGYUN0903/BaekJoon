import java.util.Arrays;

class Solution {
    public int solution(int []A, int []B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int[] arr = new int[B.length];
        for (int i = 0; i < B.length; i++){
            arr[i] = B[B.length - 1 - i];
        }
        
        int answer = 0;
        for (int i = 0; i < A.length; i++){
            answer += A[i] * arr[i];
        }

        return answer;
    }
}