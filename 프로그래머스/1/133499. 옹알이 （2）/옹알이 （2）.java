class Solution {
    public int solution(String[] babbling) {
        String[] can = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for(String word : babbling){
            if(word.contains("ayaaya") || word.contains("yeye") || word.contains("woowoo") || word.contains("mama")){
                continue;
            }
            
            for(String c : can){
                word = word.replace(c, " ");
            }
            
            if(word.trim().isEmpty()){
                answer++;
            }
        }
        return answer;
    }
}