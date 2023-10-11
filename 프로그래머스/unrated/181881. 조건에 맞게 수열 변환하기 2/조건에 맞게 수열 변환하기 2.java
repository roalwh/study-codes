
import java.util.Arrays;
class Solution {
  public static int solution(int[] arr) {
    int answer = 0;
    int count = 0;
    boolean flag = false;
    int[] tmparr1 = new int[arr.length];
    int[] tmparr2 = new int[arr.length];

    while (flag == false) {
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] >= 50 && arr[i] % 2 == 0) {
          arr[i] = arr[i] / 2;
        } else if (arr[i] <= 50 && arr[i] % 2 == 1) {
          arr[i] = arr[i] * 2 + 1;
        }
      }
      count++;
      tmparr2 = tmparr1.clone();
      tmparr1 = arr.clone();
      if (Arrays.equals(tmparr1, tmparr2)) {
        flag = true;
        break;
      }
    }
    if(count==2){
      answer = count-2;
    }else{
      answer = count-1;
    }
      

    return answer;
  }
}