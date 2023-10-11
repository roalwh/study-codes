class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] arr = myString.toLowerCase().toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                if(arr[i]=='a'){
                    arr[i] = Character.toUpperCase(arr[i]);
                }
            }
        }
        for(char x : arr){
            answer +=x;
        }
        return answer;
    }
}