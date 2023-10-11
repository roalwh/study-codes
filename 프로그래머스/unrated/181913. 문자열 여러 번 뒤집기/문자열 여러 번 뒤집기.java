class Solution {
    public String solution(String my_string, int[][] queries) {
         String answer = "";
    char[] carr_my_string = my_string.toCharArray();

    for (int i = 0; i < queries.length; i++) {
      String c_my_string = "";
      char[] carr_tmp = {};

        int start = queries[i][0];
        int end = queries[i][1];

        // 역순 저장
        for (int k = end; k >= start; k--) {
          c_my_string += carr_my_string[k];
        }
        // 역순 배열 생성
        carr_tmp = new char[c_my_string.length()];
        carr_tmp = c_my_string.toCharArray();
        int n = 0;
        // 값 변경
        for (int x = start; x <= end; x++) {
          carr_my_string[x] = carr_tmp[n];
          n++;
        }
      

    }
    for (char x : carr_my_string) {
      answer += x;
    }
    return answer;
    }
}