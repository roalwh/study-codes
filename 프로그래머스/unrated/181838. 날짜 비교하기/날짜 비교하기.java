import java.util.Arrays;
class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        // //년도
        // if(date1[0]<date2[0]){
        //     return 1;
        // }else if(date1[0]>date2[0]){
        //     return 0;
        // }else{
        //     //월
        //     if(date1[1]<date2[1]){
        //         return 1;
        //     }else if(date1[1]>date2[1]){
        //         return 0;
        //     }else{
        //         //일
        //         if(date1[2]<date2[2]){
        //             return 1;
        //         }else if(date1[0]>date2[0]){
        //             return 0;
        //         }
        //     }
        // }
        answer = Arrays.compare(date1, date2) < 0 ? 1 : 0;
        
        return answer; 
    }
}