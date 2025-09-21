import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int[] arr = new int[citations.length];
        
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++){
            arr[citations.length - 1 - i] = citations[i];
        }
        
        int maxH = 0;
        for (int j = 0; j < arr.length; j++){
            int h = j + 1;
            
            if(arr[j] >= h){
                maxH = h;
            } else {
                break;
            }
            
        }
        return maxH;
    }
}