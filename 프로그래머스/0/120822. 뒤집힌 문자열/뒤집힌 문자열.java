class Solution {
    public String solution(String my_string) {
        char[] strings = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strings.length; i++){
            sb.append(strings[strings.length - i - 1]);
        }
        return sb.toString();
    }
}