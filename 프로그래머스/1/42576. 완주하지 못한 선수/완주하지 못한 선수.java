import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> maps = new HashMap<>();
        for (String person : participant){
            maps.put(person, maps.getOrDefault(person,0) + 1);
        }
        
        for (String name : completion){
            maps.put(name, maps.get(name) - 1);
        }
        
        for (String key : maps.keySet()) {
            if (maps.get(key) == 1){
                return key;
            }
        }
        return answer;
    }
}