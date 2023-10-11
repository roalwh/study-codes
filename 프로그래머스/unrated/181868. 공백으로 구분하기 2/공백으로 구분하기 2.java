import java.util.ArrayList;
class Solution {
    public String[] solution(String my_string) {
//     String[] answer = {};
//     ArrayList<Integer> i_idx = new ArrayList();
//     ArrayList<String> tmpList = new ArrayList();
//     char[] c_arr = my_string.toCharArray();
//     for(int i=0;i<c_arr.length;i++){
//       if(c_arr[i]!=' '){
//         i_idx.add(i);
//       }
//     }
//     for(int i=0,j=0;i<c_arr.length;i++){
//       String tmp = "";
//       // 1
//       if(c_arr[i]!=' '){
//         // 1==1
//         if(i==i_idx.get(j)){
//           //다음 부분이 i_idx와 같지않을때 탈출
//           // 1
//           while(i==i_idx.get(j)){
//             tmp +=c_arr[i];
//             i++;
//             j++;
//             if(j>i_idx.size()-1){
//               break;
//             }
//           }
//           if(tmp.length()!=0){
//             tmpList.add(tmp);
//           }
          
//           // 2에서 탈출
//         }
//       } 
//     }
//     answer = new String[tmpList.size()];
//     for(int i=0;i<answer.length;i++){
//       answer[i] = tmpList.get(i);
//     }
//     return answer;
//     }
        //trim 으로 공백제거, split으로 [ ] 정규식 처리하여 출력
        return my_string.trim().split("[ ]+");
    }
}