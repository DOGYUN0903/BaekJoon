import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    boolean solution(String s) {
        
        char[] cArr = s.toCharArray();
        
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : cArr) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        
        return stack.isEmpty();
    }
}