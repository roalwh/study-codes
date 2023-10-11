class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        char[] arr = myString.toCharArray();
        String tmp = "";
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='A'){
                arr[i]='B';
            }else if(arr[i]=='B'){
                arr[i]='A';
            }
            tmp +=arr[i];
        }
        if(tmp.contains(pat)){
            answer = 1;
        }else{
            answer = 0;
        }
        
        return answer;
    }
}