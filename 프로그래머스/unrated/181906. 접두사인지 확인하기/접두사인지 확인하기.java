import java.util.ArrayList;

class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
         ArrayList<String> tmpString = new ArrayList();
        
        for(int i=1; i<my_string.length();i++){
            tmpString.add(my_string.substring(0,i));
        }
        
        for(String x : tmpString){
            if(is_prefix.equals(x))
                answer++;
        }
        
        return answer;
    }
}