class Solution {
    public int solution(int slice, int n) {
        if (n == 1) return 1;
        if (n == slice) return 1;
        if (n > slice) {
            if (n % slice == 0){
                return n / slice;
            } else {
                return n / slice + 1;
            }
        } else {
            return 1;
        }
    }
}