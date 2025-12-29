class Solution {
    public String solution(String phone_number) {
        char[] arr = phone_number.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length - 4; i++) {
            sb.append("*");
        }
        
        for (int i = arr.length - 4; i <= arr.length - 1; i++){
            sb.append(arr[i]);
        }
        
        return sb.toString();
    }
}