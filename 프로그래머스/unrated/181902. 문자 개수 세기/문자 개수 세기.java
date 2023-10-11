import java.util.ArrayList;

class Solution {
    public int[] solution(String my_string) {
        //A-Z 65~90 a-z 97-122
        int[] answer = new int[52];
        char[] carr_my_string = my_string.toCharArray();
        ArrayList<Character> aList = new ArrayList();
        
        for(int i=65;i<91;i++){
            aList.add((char) i);
        }
        for(int i=97;i<123;i++){
            aList.add((char) i);
        }
        
        for(int i=0;i<aList.size();i++){
            int count = 0;
            for(int j=0;j<carr_my_string.length;j++){
                if(aList.get(i)==carr_my_string[j]){
                    count++;
                }
            answer[i] = count;
            }
            
        }
        
    
        return answer;
    }
}