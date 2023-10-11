class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
//         for(int i=0;i<my_string.length();i++){
//             if(i + target.length() <= my_string.length()){
//                 String tmp = my_string.substring(i,i+target.length());
//                 if(tmp.equals(target)){
//                     answer = 1;
//                     return answer;
//                 }else{
//                     answer = 0;
//                 }
//             }else{
//                 answer = 0;
//                 return answer;
//             }
            
//         }
        answer = my_string.contains(target) ? 1:0;
        
            
        return answer;
    }
}