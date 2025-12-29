class Solution {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        long num = (long) sqrt;
        
        if (num * num == n) {
            return (num + 1) * (num + 1);
        }
        
        return -1;
    }
}