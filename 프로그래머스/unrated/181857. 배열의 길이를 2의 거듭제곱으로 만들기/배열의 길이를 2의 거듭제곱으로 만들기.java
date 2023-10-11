class Solution {
    public int[] solution(int[] arr) {
       int[] answer = {};
    int arr_len = arr.length;
    int x=1;
         //arr길이가 거듭제곱값x보다 작을때
    while(x<arr_len){
           x *= 2;
    }
    answer = new int[x];
    for(int i=0;i<arr.length;i++){
        answer[i] = arr[i];
    }
    return answer;
    }
}