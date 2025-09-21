import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int minWidth = 0;
        
        for (int[] size : sizes){
            int bigger = Math.max(size[0], size[1]);
            int smaller = Math.min(size[0], size[1]);
            
            maxWidth = Math.max(maxWidth, bigger);
            minWidth = Math.max(minWidth, smaller);            
        }

        return maxWidth * minWidth;
    }
}