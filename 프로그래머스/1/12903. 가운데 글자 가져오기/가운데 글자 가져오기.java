class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        if (s.length() % 2 == 0){
            sb.append(arr[arr.length / 2 - 1]);
            sb.append(arr[arr.length / 2]);
        } else {
            sb.append(arr[(arr.length - 1 ) / 2]);
        }
        return sb.toString();
    }
}