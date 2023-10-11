import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList <Integer> arr = new ArrayList();
        int[] answer = {};
        for(int i=n,j=0;i<num_list.length;i++){
            arr.add(num_list[i]);
        }
        
        for(int i=0 ; i<n;i++){
            arr.add(num_list[i]);
        }
        answer = new int[arr.size()];
        for(int i=0; i<answer.length;i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}