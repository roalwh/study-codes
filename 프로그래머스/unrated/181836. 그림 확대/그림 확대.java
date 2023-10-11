class Solution {
    public String[] solution(String[] picture, int k) {
     String[] answer = new String[picture.length * k];
        // picture 길이만큼 반복
        for (int i = 0, c = 0; i < picture.length; i++) {
          String tmp = "";
          // picture[0] 부터 하나씩 꺼냄
          for (int j = 0; j < picture[i].length(); j++) {
            String jtmp = picture[i].substring(j, j + 1);
            // k번까지 반복하여 tmp에 반복 문자 입력
            for (int x = 0; x < k; x++) {
              tmp += jtmp;
            }
          }
            //배열에 문자열 입력
          for (int y = 0; y < k; y++) {
            answer[c] = tmp;
            c++;
          }
        }
        return answer;
    }
}