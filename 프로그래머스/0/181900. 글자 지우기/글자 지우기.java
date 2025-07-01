class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        char[] words = my_string.toCharArray();
        for (int i = 0; i < words.length; i++){
            boolean keep = true;
            for (int j = 0; j < indices.length; j++){
                if (i == indices[j]){
                    keep = false;
                    break;
                }
            }
            if (keep){
                sb.append(words[i]);
            }
        }
        return sb.toString();
    }
}