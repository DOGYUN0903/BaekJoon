import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int sum = sides[0] + sides[1];
        if (sum > sides[2]) return 1;
        return 2;
    }
}