class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i=0;i<queries.length;i++){
      int s = queries[i][0];
      int e = queries[i][1];
      int k = queries[i][2];
      int tmp=0;
      int cont = 0;
        for(int j=0;j<arr.length;j++){
          if(j>=s && j<=e){
            if(arr[j]>k){
              if(cont==0){
                tmp =arr[j];
                cont = 1;
              }else{
                if(tmp>arr[j]){
                  tmp=arr[j];
                }
              }
            }
            answer[i] = tmp;
          }
        }
        if(answer[i]==0){
          answer[i] = -1;
        }
    }
        return answer;
    }
}