import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
    int[] answer = {};
    ArrayList<Integer> arr= new ArrayList();
    arr.add(n);

    while(n>1){
        if(n%2==0){
            n = n/2;
            arr.add(n); 
        }else{
          n = 3 * n+1;
          arr.add(n);
        }
    }

    answer = new int[arr.size()];
    for(int i=0;i<answer.length;i++){
      answer[i] = arr.get(i);
    }
    return answer;
    }
}