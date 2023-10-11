class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] carr = myString.toCharArray();
        for(char x : carr){
            if(x<'l'){
                answer+='l';
            }else{
                answer+=x;
            }
        }
        return answer;
    }
}