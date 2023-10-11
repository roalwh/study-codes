import java.util.ArrayList;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        char[] c_arr = my_string.toCharArray();
        ArrayList<String> s_arr = new ArrayList();
        String tmp = "";
        for(int i=0;i<c_arr.length;i++){
            if(c_arr[i]==' '){
                s_arr.add(tmp);
                tmp = "";
            }else{
                tmp +=c_arr[i];
                if(i==c_arr.length-1)
                    s_arr.add(tmp);
            }
        }
        answer = new String[s_arr.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = s_arr.get(i);
        }
        
        return answer;
    }
}