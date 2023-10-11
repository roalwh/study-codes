import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> two_index = new ArrayList();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                two_index.add(i);
            }
        }
        if(two_index.size()!=0){
            if(two_index.size()==1){
                answer = new int[1];
                answer[0] = arr[two_index.get(0)];
            }else{
                int s=0;
                int e=0;
                for(int i=1;i<two_index.size();i++){
                    e = Math.max(two_index.get(0),two_index.get(i));
                    s = Math.min(two_index.get(0),two_index.get(i));
                }
                answer = new int[e - s+1];
                for (int i = s,j=0; j < answer.length; i++) {
                    answer[j] = arr[i];
                    j++;
                }     
            }
        }else{
            answer = new int[1];
            answer[0] = -1;
        }
        
        
        return answer;
    }
}