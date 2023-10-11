class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        if(num_list.length>=11){
            for(int x: num_list){
                answer += x;
            }
        }else if(num_list.length<=10){
            answer=1;
            for(int x : num_list){
                answer =answer * x; 
            }
        }
            
        return answer;
    }
}