import java.util.Set;
import java.util.HashSet;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Set<String> set = new HashSet();
        
        for (String number : phone_book){
            set.add(number);
        }

        for (String phone : phone_book) {
            for (int i = 1; i < phone.length(); i++){
                String prefix = phone.substring(0, i);
                
                if (set.contains(prefix)) {
                    return false;
                }
            }
        }
        
        return answer;
    }
}