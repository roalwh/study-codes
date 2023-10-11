import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
    int[] answer = {};
    ArrayList<Integer> stk = new ArrayList();
    // 만약 stk이 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다.
    stk.add(arr[0]);
        
    for (int i = 1; i < arr.length; i++) {
      // stk에 원소가 있고, stk의 마지막 원소가 arr[i]와 같으면 stk의 마지막 원소를 stk에서 제거하고 i에 1을 더합니다.
      if (stk.size() != 0 && stk.get(stk.size() - 1) == arr[i]) {
        stk.remove(stk.size() - 1);
        //stk에 원소가 있는데 stk의 마지막 원소가 arr[i]와 다르면 stk의 맨 마지막에 arr[i]를 추가하고 i에 1을 더합니다.
      } else if (stk.size() != 0 && stk.get(stk.size() - 1) != arr[i]) {
        stk.add(arr[i]);
        // 만약 stk이 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다.
      } else {
        stk.add(arr[i]);
      }
    }
        
    if (stk.size() == 0) {
      answer = new int[1];
      answer[0] = -1;
    } else {
      answer = new int[stk.size()];
      for (int i = 0; i < answer.length; i++)
        answer[i] = stk.get(i);

    }

    return answer;
    }
}