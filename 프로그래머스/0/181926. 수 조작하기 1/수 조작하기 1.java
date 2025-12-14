class Solution {
    public int solution(int n, String control) {
        char[] cArr = control.toCharArray();
        for (int i = 0; i < cArr.length; i++){
            if (cArr[i] == 'w') {
                n += 1;
            } else if (cArr[i] == 's') {
                n -= 1;
            } else if (cArr[i] == 'd') {
                n += 10;
            } else if (cArr[i] == 'a') {
                n -= 10;
            }
        }
        
        return n;
    }
}