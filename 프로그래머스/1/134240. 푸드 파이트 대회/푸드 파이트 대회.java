class Solution {
    public String solution(int[] food) {
        String answer = "";
        int[] newFood = new int[food.length - 1];
        for(int i = 0; i < newFood.length; i++){
            newFood[i] = food[i+1] / 2;
        }
        
        String front = "";
        for(int j = 1; j <= newFood.length; j++){
            for(int m = 0; m < newFood[j - 1]; m++){
                front+= String.valueOf(j);
            }
        }
        
        String back = "";
        for(int k = front.length() - 1; k >= 0; k--){
            back += front.charAt(k);
        }
        
        answer = front + "0" + back;
        
        return answer;
    }
}