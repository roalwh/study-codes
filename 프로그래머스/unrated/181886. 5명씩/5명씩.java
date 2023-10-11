import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList();
        
        for(int i=0;i<names.length;i++){
            if(i%5==0)
                arr.add(names[i]);
        }
        answer = new String[arr.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}