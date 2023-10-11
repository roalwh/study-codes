class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        char[] carr = code.toCharArray();
        for(int i=0;i<carr.length;i++){
            if(i%q==r){
                answer += carr[i];
            }
        }
        return answer;
    }
}