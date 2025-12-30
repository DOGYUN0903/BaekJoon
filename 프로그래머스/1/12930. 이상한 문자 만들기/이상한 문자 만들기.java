class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" ", -1);
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < strArr.length; i++) {
            StringBuilder sb = new StringBuilder();
            char[] arr = strArr[i].toCharArray();
            
            for (int j = 0; j < arr.length; j++){
                if (j % 2 == 0){
                    sb.append(Character.toUpperCase(arr[j]));
                } else {
                    sb.append(Character.toLowerCase(arr[j]));
                }
            }
            
            result.append(sb.toString());
            
            if (i < strArr.length - 1){
                result.append(" ");
            }
        }
        
        return result.toString();
    }
}