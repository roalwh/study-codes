class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start-end_num+1];
        for(int i=start,j=0;j<answer.length;i--){
            answer[j] = i;
            j++;
        }
        return answer;
    }
}