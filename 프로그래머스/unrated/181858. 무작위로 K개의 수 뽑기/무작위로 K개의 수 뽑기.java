import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
    //중복제거
    int[] dis_arr = Arrays.stream(arr).distinct().toArray();

    //완성될 배열의 길이가 k보다 작으면 나머지 값을 전부 -1로 채워서 return 합니다.
    if(dis_arr.length<k){
      ArrayList<Integer> tmparr = new ArrayList();
      for(int x : dis_arr)
        tmparr.add(x);

      for(int i=tmparr.size();i<k;i++){
        tmparr.add(-1);
      }
      for(int i=0;i<answer.length;i++){
        answer[i] = tmparr.get(i);
      }

    // k보다 클때
    }else if(dis_arr.length>k){
      answer = Arrays.copyOfRange(dis_arr, 0, k);

    // 동일할떄
    }else{
      answer = dis_arr.clone();
    }
    return answer;
    }
}