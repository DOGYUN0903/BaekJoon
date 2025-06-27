class Solution {
    public int solution(String myString, String pat) {
        String replace = myString.replace("A", "x")
            .replace("B", "A")
            .replace("x","B");
        return replace.contains(pat) ? 1 : 0;
    }
}