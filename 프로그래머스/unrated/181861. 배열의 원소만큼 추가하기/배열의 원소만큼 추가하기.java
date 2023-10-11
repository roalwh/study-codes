import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> tmplist = new ArrayList();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i];j++){
                tmplist.add(arr[i]);
            }
        }
        answer = new int[tmplist.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = tmplist.get(i);
        }
        return answer;
    }
}