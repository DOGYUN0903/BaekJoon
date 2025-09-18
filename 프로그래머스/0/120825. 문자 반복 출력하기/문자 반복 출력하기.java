class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        char[] chars = my_string.toCharArray();
        for(int i = 0; i < chars.length; i++){
            for(int j = 0; j < n; j++){
                sb.append(chars[i]);
            } 
        }
        return sb.toString();
    }
}