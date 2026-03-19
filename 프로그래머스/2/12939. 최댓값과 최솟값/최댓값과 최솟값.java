class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split(" ");
        
        int[] numArr = new int[strArr.length];
        
        for (int i = 0; i < numArr.length; i++){
            numArr[i] = Integer.parseInt(strArr[i]);
        }
        
        int max = numArr[0];
        int min = numArr[0];
        
        for (int j = 0; j < numArr.length; j++){
            if (numArr[j] > max) {
                max = numArr[j];
            } else if(numArr[j] < min) {
                min = numArr[j];
            }
        }
        
        answer = min + " " + max;
        
        return answer;
    }
}