class Solution {
    public String solution(int[] food) {
        String answer = "";
        int[] newFood = new int[food.length - 1];
        for(int i = 0; i < newFood.length; i++){
            newFood[i] = food[i+1] / 2;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int j = 1; j <= newFood.length; j++){
            for(int m = 0; m < newFood[j - 1]; m++){
                sb.append(j);
            }
        }
        
        StringBuilder sbReverse = new StringBuilder(sb).reverse();
        
        answer = sb.toString() + "0" + sbReverse.toString();
        
        return answer;
    }
}