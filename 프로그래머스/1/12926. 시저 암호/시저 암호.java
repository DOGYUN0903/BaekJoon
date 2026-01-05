class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(c);
            } else if (c >= 'a' && c <= 'z') {
                char moved = (char) (c + n);
                if (moved > 'z') {
                    moved -= 26;
                }
                sb.append(moved);
            } else {
                char moved = (char) (c + n);
                if (moved > 'Z') {
                    moved -= 26;
                }
                sb.append(moved);
            }
        }
        
        return sb.toString();
    }
}