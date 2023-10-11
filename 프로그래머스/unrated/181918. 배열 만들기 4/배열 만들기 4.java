import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
    int[] stk = {};
    ArrayList<Integer> stkList = new ArrayList();

    int i =0;
    while(i<arr.length){
      if(stkList.size()==0){
        stkList.add(arr[i]);
        i++;
      }

      if(stkList.size()!=0 && stkList.get(stkList.size()-1)<arr[i]){
        stkList.add(arr[i]);
        i++;
      }else if(stkList.size()!=0 && stkList.get(stkList.size()-1)>=arr[i]){
        stkList.remove(stkList.size()-1);
      }
      // System.out.println(Arrays.deepToString(stkList.toArray()));
    }
    stk = new int[stkList.size()];
    for(int x=0;x<stk.length;x++){
      stk[x] = stkList.get(x);
    }
    return stk;
    }
}