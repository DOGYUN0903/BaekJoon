class Solution {
    public int[] solution(String s) {
        int transformCount = 0;
        int totalzeroCount = 0;
        
        while (!s.equals("1")){
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (c == '0') totalzeroCount++;
                else sb.append(c);
            }
            
            int length = sb.toString().length();
            s = Integer.toBinaryString(length);
            
            transformCount++;
        }
        
        return new int[]{transformCount, totalzeroCount};
    }
}