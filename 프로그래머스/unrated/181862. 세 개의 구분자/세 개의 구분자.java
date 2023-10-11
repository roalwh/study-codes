import java.util.ArrayList;
import java.util.Arrays;
class Solution {
   public String[] solution(String myStr) {
    String[] answer = {};
    String[] tmp = {};
    tmp = myStr.split("[a,b,c]");
    ArrayList<String> tmplist = new ArrayList<String>(Arrays.asList(tmp));
    int tmplen = tmplist.size();
    for(int i=0,j=0;i<tmplen;i++){
      if(tmplist.get(j).length()==0){
        tmplist.remove(j);
      }else{
        j++;
      }
    }
    if(tmplist.size()==0){
      answer = new String[1];
      answer[0] = "EMPTY";
    }else{
      answer = new String[tmplist.size()];
      for(int i=0;i<answer.length;i++){
        answer[i] = tmplist.get(i);
      }
    }
    return answer;
}
}