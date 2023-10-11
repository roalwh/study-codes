class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        int setnum= 0;
        setnum += a;
        if(included[0]){
            answer+=setnum;
        }
        
        for(int i=1;i<included.length;i++){
            setnum += d;
            if(included[i]){
                answer+=setnum;
            }
        }
        return answer;
    }
}