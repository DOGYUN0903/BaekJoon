class Solution {
    public int[] solution(String myString) {
        String[] arrX = myString.split("x", -1);
        int[] answer = new int[arrX.length];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arrX[i].length();
        }
        return answer;
    }
}