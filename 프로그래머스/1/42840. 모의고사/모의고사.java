class Solution {
    public int[] solution(int[] answers) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,1,2,3,2,4,2,5};
        int[] arr3 = {3,3,1,1,2,2,4,4,5,5};
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == arr1[i % arr1.length]) count1++;
            if(answers[i] == arr2[i % arr2.length]) count2++;
            if(answers[i] == arr3[i % arr3.length]) count3++;
        }
        
        int max = count1;
        if (count2 > max) max = count2;
        if (count3 > max) max = count3;
        
        int maxSize = 0;
        if (count1 == max) maxSize++;
        if (count2 == max) maxSize++;
        if (count3 == max) maxSize++;
        
        int[] answer = new int[maxSize];
        int index = 0;
        if (count1 == max) answer[index++] = 1;
        if (count2 == max) answer[index++] = 2;
        if (count3 == max) answer[index++] = 3;
        
        return answer;
    }
}