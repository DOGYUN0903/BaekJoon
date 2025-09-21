import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        
        for (String[] cloth : clothes){
            String type = cloth[1];
            
            if (map.containsKey(type)){
                map.put(type, map.get(type) + 1);
            } else {
                map.put(type, 1);
            }
        }
        
        int result = 1;
        for (Integer count : map.values()){
            result *= (count + 1);
        }
        
        return result - 1;
    }
}