class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        
        String[] s = rsp.split("");
        
        for (int i = 0; i < s.length; i++){
            if (s[i].equals("2")){
                sb.append("0");
            } else if (s[i].equals("0")){
                sb.append("5");
            } else {
                sb.append("2");
            }
        }
        return sb.toString();
    }
}