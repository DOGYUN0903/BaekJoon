class Solution {
    public int solution(String binomial) {
        String[] strArr = binomial.split(" ");
        int answer = 0;
        if(strArr[1].equals("+")){
            answer = Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[2]);
        } else if(strArr[1].equals("-")){
            answer = Integer.parseInt(strArr[0]) - Integer.parseInt(strArr[2]);
        } else if(strArr[1].equals("*")){
            answer = Integer.parseInt(strArr[0]) * Integer.parseInt(strArr[2]);
        }
        
        return answer;
    }
}