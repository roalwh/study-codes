import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        ArrayList<Integer> tmparr = new ArrayList();
        
        for(int i=0;i<flag.length;i++){
            //flag가 true ? false
            if(flag[i]){
                for(int j=0;j<arr[i]*2;j++){
                    tmparr.add(arr[i]);
                }
            }else{
                for(int j=0;j<arr[i];j++){
                    tmparr.remove(tmparr.size()-1);
                }
            }
        }
        answer = new int[tmparr.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = tmparr.get(i);
        }
        
        return answer;
    }
}