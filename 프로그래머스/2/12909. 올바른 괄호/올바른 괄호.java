import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        char[] ch = s.toCharArray();
        
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : ch){
            if (c == '('){
                stack.push(c);
            } else {
                if (stack.isEmpty()){
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        
        return stack.isEmpty();
    }
}