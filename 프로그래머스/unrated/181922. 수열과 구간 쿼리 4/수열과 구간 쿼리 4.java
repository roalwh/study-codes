class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];

    for (int i = 0; i < queries.length; i++) {
      int s = queries[i][0];
      int e = queries[i][1];
      int k = queries[i][2];

      for(int j=s;j<=e;j++){
        if (j >= s && j <= e) {
          if(j==0){
              arr[j] = arr[j] + 1;
          }else{
            if (j % k == 0) {
                arr[j] = arr[j] + 1;
            }
          }
      }
      }

    }
    answer = arr;

        return answer;
    }
}