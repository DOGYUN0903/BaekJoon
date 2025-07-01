class Solution {
    boolean solution(String s) {
        boolean answer = true;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        String newS = s.toLowerCase();
        int pCount = 0;
        int yCount = 0;
        for (int i = 0; i < newS.length(); i++){
            if (newS.charAt(i) == 'p'){
                pCount++;
            } else if (newS.charAt(i) == 'y'){
                yCount++;
            }
        }
        if (pCount == 0 && yCount ==0){
            answer = true;
        }
        if (pCount == yCount){
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}