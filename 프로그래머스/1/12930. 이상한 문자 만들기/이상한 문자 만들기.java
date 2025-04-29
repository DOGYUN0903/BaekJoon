class Solution {
    public String solution(String s) {
        String[] str = s.split(" ", -1);
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < str.length; i++) {
            char[] ch = str[i].toCharArray();

            for (int j = 0; j < ch.length; j++) {
                if (j % 2 == 0) {
                    answer.append(Character.toUpperCase(ch[j]));
                } else {
                    answer.append(Character.toLowerCase(ch[j]));
                }
            }

            if (i < str.length - 1) {
                answer.append(" ");
            }
        }

        return answer.toString();
    }
}