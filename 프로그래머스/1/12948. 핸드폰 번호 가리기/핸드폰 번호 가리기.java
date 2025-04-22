class Solution {
    public String solution(String phone_number) {
        int len = phone_number.length();  
        String last4 = phone_number.substring(len - 4); 
        String stars = "*".repeat(len - 4); 
        return stars + last4;
    }
}