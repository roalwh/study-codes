import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        String[] tmp = myString.split("x",-1);
        ArrayList<String> arr = new ArrayList();
        
        for(int i = 0;i<tmp.length;i++){
            if(tmp[i].length()!=0)
                arr.add(tmp[i]);
        }
        
        answer = new String[arr.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = arr.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}