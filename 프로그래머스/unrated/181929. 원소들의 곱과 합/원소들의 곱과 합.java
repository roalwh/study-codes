class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int x =1;
        int y =0;
        
        for(int i=0; i<num_list.length;i++){
            x *=num_list[i];
            y +=num_list[i];
        }
        if(x<(Math.pow(y,2))){
            answer = 1;
        }else{
            answer = 0;
        }
        
        
        return answer;
    }
}