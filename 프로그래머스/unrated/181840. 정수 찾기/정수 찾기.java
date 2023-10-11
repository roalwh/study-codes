import java.util.*;
import java.util.stream.IntStream;
class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for(int x : num_list){
            if(x==n)
                answer=1;
        }
        // answer = IntStream.of(num_list).anyMatch(x -> x == n) ? 1:0;
        return answer;
    }
}