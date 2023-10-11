import java.util.Arrays;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer =  0;
        int[] tmparr = {};
        int attencount = 0;
        //임시 배열 크기 
        for(boolean x : attendance){
            if(x == true)
                attencount+=1;            
        }
        //순위를 저장할 배열
        tmparr = new int[attencount];
        
        //조건 일치시 인덱스 값 저장
        //1등부터 길이만큼의 등수
        for(int i=1,x=0;i<=rank.length;i++){
            //랭크 순번대로 참조
           for(int j=0;j<rank.length;j++){
                //rank[j] 값과 i 값이 일치 하는가?
               if(rank[j]==i){
                   // attendance 값이 true인가?
                   if(attendance[j]==true){
                       tmparr[x]=j;
                       x++;
                   }
               }
           }
        }
        answer = 10000*tmparr[0] + 100*tmparr[1] + tmparr[2];
        return answer;
    }
}