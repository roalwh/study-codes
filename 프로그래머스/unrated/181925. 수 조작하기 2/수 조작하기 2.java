class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i=0;i<numLog.length-1;i++){
            int x = numLog[i+1]-numLog[i];
           if(x==1){
            answer += "w";
            }
            if(x== -1){
            answer += "s";
            } 
            if(x== 10){
            answer +="d";
            } 
            if(x== -10){
            answer += "a";
            } 
        }
        
        
        
        return answer;
    }
}