class Solution {
    public int solution(int num, int k) {
        String str = String.valueOf(num);
        char[] ch = str.toCharArray(); 

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] - '0' == k) {
                return i + 1;
            }
        }

        return -1;
    }
}
