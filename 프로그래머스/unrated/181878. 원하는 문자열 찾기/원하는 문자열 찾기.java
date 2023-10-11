class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String low_myString = myString.toLowerCase();
        String low_pat = pat.toLowerCase();
        answer = low_myString.contains(low_pat) ? 1:0;
        return answer;
    }
}