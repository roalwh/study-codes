class Solution {
    public String solution(String rny_string) {
        String answer = "";
        char[] arr = rny_string.toCharArray();
        for(char x : arr){
            if(x=='m'){
                answer += "rn";
            }else{
                answer += x;
            }
        }
//         rny_string.replaceAll("m", "rn");
        return answer;
    }
}