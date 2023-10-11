class Solution {
    public int solution(String number) {
    int answer = 0;
    char[] carr = number.toCharArray();
    int tmp = 0;
    for (char x : carr) {
      tmp += Integer.parseInt(String.valueOf(x));
    }
    answer = tmp % 9;
    return answer;
    }
}