class Solution {
    public int solution(String num_str) {
        int answer = 0;
        char[] carr = num_str.toCharArray();
        for(char x : carr){
            
            answer += Integer.parseInt(String.valueOf(x));
        }
        
        return answer;
    }
}