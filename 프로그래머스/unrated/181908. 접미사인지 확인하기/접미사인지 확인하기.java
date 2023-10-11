import java.util.ArrayList;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        ArrayList<String> tmpString = new ArrayList();
        
        for(int i=0; i<my_string.length();i++){
            tmpString.add(my_string.substring(i,my_string.length()));
        }
        
        for(String x : tmpString){
            if(is_suffix.equals(x))
                answer++;
        }
        
        return answer;
    }
}