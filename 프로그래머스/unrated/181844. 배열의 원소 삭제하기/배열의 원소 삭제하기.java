import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        List<Integer> tmpList = new ArrayList();
        
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<delete_list.length;j++){
                if(arr[i]==delete_list[j]){
                    count++;
                }
            }
            if(count==0){
                tmpList.add(arr[i]);
            }
        }
        answer = new int[tmpList.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = tmpList.get(i);
        }
        
        return answer;
    }
}