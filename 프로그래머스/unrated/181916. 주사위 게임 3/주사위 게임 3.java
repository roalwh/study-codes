import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static int solution(int a, int b, int c, int d) {
    int answer = 0;
    // 4
    if ((a == b) && (b == c) && (c == d)) {
      answer = 1111 * a;
    //3:1
    } else if (((a == b && b == c) && a != d) || ((a == b && b == d) && a != c) || ((a == c && c == d) && a != b) || ((b == c && c == d) && b != a)) {
      int[] arr = { a, b, c, d };
      ArrayList<Integer> p = new ArrayList();
      ArrayList<Integer> q = new ArrayList();
      if((a == b && b == c) || (a == b && b == d) || (a == c && c == d) ){
        for (int i = 0; i < arr.length; i++) {
          if (a == arr[i]) {
            p.add(arr[i]);
          } else {
            q.add(arr[i]);
          }
        }
      }else{
        for (int i = 0; i < arr.length; i++) {
          if (b == arr[i]) {
            p.add(arr[i]);
          } else {
            q.add(arr[i]);
          }
        }
      }
      
      if (p.size() > q.size()) {
        answer = (int) Math.pow((10 * p.get(0) + q.get(0)), 2);
      } else {
        answer = (int) Math.pow((10 * q.get(0) + p.get(0)), 2);
      }
    //2:2
    } else if ((a == b && c == d) || (a == c && b == d) || (a == d && c == b)) {
      int[] arr = { a, b, c, d };
      ArrayList<Integer> p = new ArrayList();
      ArrayList<Integer> q = new ArrayList();
      p.add(arr[0]);

      for (int i = 1; i < arr.length; i++) {
        if (arr[0] == arr[i]) {
          p.add(arr[i]);
        } else {
          q.add(arr[i]);
        }
      }
      if(p.get(0)>q.get(0)){
        answer = (p.get(0) + q.get(0)) * (p.get(0) - q.get(0));
      }else{
        answer = (q.get(0) + p.get(0)) * (q.get(0) - p.get(0));
      }
      
    //2:1:1
    } else if (a == b || a == c || a == d || b == c || b == d || c == d) {
      int[] arr = { a, b, c, d };
      int[] arrtmp = new int[2];
      int[] arrtmp2 = new int[2];
      int j = 0;
      int k = 0;
      if (a == b || a == c || a == d) {
        for (int i = 0; i < arr.length; i++) {
          if (a == arr[i]) {
            arrtmp[j] = arr[i];
            j++;
          } else {
            arrtmp2[k] = arr[i];
            k++;
          }
        }
        answer = arrtmp2[0] * arrtmp2[1];
      }else if(b == c || b == d){
        for (int i = 0; i < arr.length; i++) {
          if (b == arr[i]) {
            arrtmp[j] = arr[i];
            j++;
          } else {
            arrtmp2[k] = arr[i];
            k++;
          }
        }
        answer = arrtmp2[0] * arrtmp2[1];
      }else{
        for (int i = 0; i < arr.length; i++) {
          if (c == arr[i]) {
            arrtmp[j] = arr[i];
            j++;
          } else {
            arrtmp2[k] = arr[i];
            k++;
          }
        }
        answer = arrtmp2[0] * arrtmp2[1];
      }

    } else {
      int[] arr = { a, b, c, d };
      Arrays.sort(arr);
      answer = arr[0];
    }
    return answer;

  }
}