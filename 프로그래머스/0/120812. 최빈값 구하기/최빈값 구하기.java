class Solution {
    public int solution(int[] array) {
        int[] count = new int[1000];
        
        for (int num : array) {
            count[num]++;
        }
        
        int maxFreq = 0;
        for (int freq : count) {
            maxFreq = Math.max(maxFreq, freq);
        }
        
        int mode = -1;
        int modeCount = 0;
        
        for (int i = 0; i < count.length; i++) {
            if (count[i] == maxFreq) {
                mode = i;
                modeCount++;
            }
        }
        
        return modeCount > 1 ? -1 : mode;
    }
}