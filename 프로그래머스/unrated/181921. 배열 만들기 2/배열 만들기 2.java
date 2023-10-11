import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
    int[] answer = {};
    List<String> tmplist = new ArrayList();

    for (int i = l; i <= r; i++) {
      String is = Integer.toString(i);
      char[] carr = is.toCharArray();
      String sans = "";
      int count = 0;
//     5와 0 검사 전체 중 5,0 이아닌 값이있을시 카운트
      for (char j : carr) {
        if(j=='5' || j=='0'){
          sans +=j;
        }else{
          count+=1;
        }
      }
//     다른값이 없으면 리스트에 입력
      if(count==0){
        tmplist.add(sans);
      }
    }
        
    //리스트 사이즈가 0인경우 -1을 배열로 입력
    if(tmplist.size()==0){
      answer = new int[1];
      answer[0] = -1;
      return answer; 
    }else{
      answer = new int[tmplist.size()];
      for (int i = 0; i < answer.length; i++) {
        answer[i] = Integer.parseInt(tmplist.get(i));
      }
      return answer;
    }
    }
}