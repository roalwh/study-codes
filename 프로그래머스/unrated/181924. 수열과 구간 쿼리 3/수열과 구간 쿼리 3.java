class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for(int i=0; i<queries.length;i++){
      int tmp1=queries[i][0];
      int tmp2=queries[i][1];
      
      int ctmp = arr[tmp1];
      arr[tmp1] = arr[tmp2];
      arr[tmp2] = ctmp;
    }
      answer=arr;
        return answer;
    }
}