class Solution {
    public int solution(int[][] sizes) {        
        int left = 0;
        int right = 0;
        int answer = 0;
        int[][] resizes = new int[sizes.length][sizes[0].length];
        
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > sizes[i][1]) {
                continue;
            } else {
                int temp = 0;
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        
        for (int i = 0; i < sizes.length; i++) {
            if (right < sizes[i][0]) {
                right = sizes[i][0];
            }
        }
        
        for (int i = 0; i < sizes.length; i++) {
            if (left < sizes[i][1]) {
                left = sizes[i][1];
            }
        }
        
        return right * left;
    }
}