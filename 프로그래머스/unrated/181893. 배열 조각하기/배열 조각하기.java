import java.util.ArrayList;

class Solution {
  public static int[] solution(int[] arr, int[] query) {
    int[] answer = {};
    ArrayList<Integer> tmparr = new ArrayList();
    for (int i = 0; i < arr.length; i++) {
      tmparr.add(arr[i]);
    }
    for (int i = 0; i < query.length; i++) {
      
      int tmpsize = tmparr.size();
      if (i % 2 == 0) {
        for(int j=query[i]+1;j<tmpsize;j++){
          tmparr.remove(query[i]+1);
        }

      } else if(i % 2 == 1){ 
            for(int j=0;j<query[i];j++){
              tmparr.remove(0);
          }
      }
    }
    answer = new int[tmparr.size()];
    for (int i = 0; i < answer.length; i++) {
      answer[i] = tmparr.get(i);
    }

    return answer;
  }
}