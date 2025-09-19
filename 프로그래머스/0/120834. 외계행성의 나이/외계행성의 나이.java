class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        char[] ch = String.valueOf(age).toCharArray();
        for(int i = 0; i < ch.length; i++){
            sb.append((char)(ch[i] - '0' + 'a'));
        }
        
        return sb.toString();
    }
}