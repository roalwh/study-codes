class Solution {
    public int[][] solution(int n) {
        int[][] arr = new int[n][n];
    int p1 = 0;
    int p2 = 0;
    int line = 1;
    int lineCount = 0;

    for (int i = 1; i <= n * n; i++) {
      if (line == 1) {
        if (lineCount != 0) {
          p1 += lineCount;
          p2 += lineCount;
        }
        for (int b = p2; b < arr[p1].length; b++) {
          if (arr[p1][b] == 0) {
            arr[p1][b] = i;

            if (b == arr[p1].length - 1 - lineCount) {
              line = 2;
              p2 = b;
              break;
            }
            i++;
          } else {
            line = 2;
            p2 = b;
            i--;
            break;
          }

        }
      } else if (line == 2) {
        if (arr[p1][p2] != 0) {
          p1 += 1;
        }
        for (int a = p1; a < arr.length; a++) {
          if (arr[a][p2] == 0) {
            arr[a][p2] = i;
            if (a == arr.length - 1 - lineCount) {
              line = 3;
              p1 = a;
              break;
            }
            i++;
          } else {
            line = 3;
            p1 = a;
            i--;
            break;
          }

        }
      } else if (line == 3) {
        if (arr[p1][p2] != 0) {
          p2 -= 1;
        }
        for (int b = p2; b >= 0; b--) {
          if (arr[p1][b] == 0) {
            arr[p1][b] = i;
            if (b == 0 + lineCount) {
              line = 4;
              p2 = b;
              break;
            }
            i++;
          } else {
            line = 4;
            p2 = b;
            i--;
            break;
          }

        }
      } else if (line == 4) {
        if (arr[p1][p2] != 0) {
          p1 -= 1;
        }
        for (int a = p1; a >= 0; a--) {
          if (arr[a][p2] == 0) {
            arr[a][p2] = i;
            if (a == 0 + lineCount) {
              line = 1;
              p1 = a;
              break;
            }
            i++;
          } else {
            line = 1;
            lineCount++;
            p1 = 0;
            p2 = 0;
            i--;
            break;
          }

        }
      }

    }
    return arr;
    }
}