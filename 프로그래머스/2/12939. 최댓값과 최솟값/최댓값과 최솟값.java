class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.split(" ");
        
        int[] arr = new int[str.length];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        sb.append(String.valueOf(min));
        sb.append(" ");
        sb.append(String.valueOf(max));        
        
        return sb.toString();
    }
}