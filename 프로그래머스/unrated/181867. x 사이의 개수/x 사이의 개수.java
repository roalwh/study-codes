
class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        // 그냥 arr 출력시 -> 같이 나옴[o, oo, o, , o, ]
        // split(x)만 했을경우 마지막 값이 생략됨
        String[] arr = myString.split("x",-1);
        
        answer = new int[arr.length];
        for(int i=0;i<answer.length;i++){
            answer[i] = arr[i].length();
        }
        
        return answer;
    }
}