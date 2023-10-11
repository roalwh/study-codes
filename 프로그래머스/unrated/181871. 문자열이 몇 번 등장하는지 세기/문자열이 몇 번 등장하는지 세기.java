import java.util.ArrayList;
class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
    ArrayList<String> tmparr = new ArrayList();
    
    for(int i=0;i<=myString.length();i++){
        if(i+pat.length()<=myString.length()){
            tmparr.add(myString.substring(i,i+pat.length()));
        }
    }
    for(int i=0;i<tmparr.size();i++){
        if(tmparr.get(i).equals(pat)){
          answer++;
        }
    }
    return answer;
    }
}