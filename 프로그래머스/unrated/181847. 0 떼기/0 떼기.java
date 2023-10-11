class Solution {
    public String solution(String n_str) {
        String answer = "";
        char[] arr = n_str.toCharArray();
        int a = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!='0'){
                a=i;
                break;
            }
        }
        for(int i=a;i<arr.length;i++){
            answer += arr[i]+"";
        }
        return answer;
    }
}