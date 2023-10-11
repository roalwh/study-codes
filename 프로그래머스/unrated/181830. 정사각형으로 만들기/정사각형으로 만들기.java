class Solution {
    public int[][] solution(int[][] arr) {
int[][] answer = {};
    // 열
    int arrA = 0;
    // 행
    int arrB = 0;

    // arr 열 행 확인
    for (int i = 0; i < arr.length; i++) {
      arrA += 1;
      for (int j = 0; j < arr[i].length; j++) {
        if (arrB < j) {
          arrB = j;
        }
      }
    }
    if (arrA < arrB+1) {
      answer = new int[arrB+1][arrB+1];
      for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
          answer[i][j] = arr[i][j];
        }
      }
    } else if (arrA > arrB+1) {
      answer = new int[arrA][arrA];
      for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
          answer[i][j] = arr[i][j];
        }
      }
    } else if(arrA == arrB+1){
      return arr;
    }
    return answer;
    }
}