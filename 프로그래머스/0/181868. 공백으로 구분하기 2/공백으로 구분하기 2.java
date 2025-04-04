import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] temp = my_string.split(" ");
        ArrayList<String> list = new ArrayList<>();

        for (String str : temp) {
            if (!str.equals("")) {
                list.add(str);
            }
        }

        return list.toArray(new String[0]);
    }
}
