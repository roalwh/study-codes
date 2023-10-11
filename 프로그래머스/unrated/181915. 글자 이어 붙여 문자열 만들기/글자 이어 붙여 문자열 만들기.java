class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
    char[] arr = my_string.toCharArray();
    for(int x : index_list){
      answer += arr[x];
    }
    return answer;
    }
}