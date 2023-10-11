class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        char[] controls = control.toCharArray();
        for(char x: controls){
            if(x=='w'){
                n += 1;
            }
            if(x=='s'){
                n -= 1;
            }
            if(x=='d'){
                n += 10;
            }
            if(x=='a'){
                n -= 10;
            }
        }
        answer=n;
        return answer;
    }
}