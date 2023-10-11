class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int i=0;
        int j=k;
        while(i<answer.length){
            answer[i] = j;
            i++;
            j+=k;
        }
        return answer;
    }
}