class Solution {
    public String solution(String code) {
        String answer = "";
            int mode = 0; // 0.1
    String ret = "";
    char[] code_arr = code.toCharArray();

    for (int i = 0; i < code_arr.length-1; i++) {

      if (mode == 0) {
        // i가 짝수일때
        // i가 0이 아닐때
        for(int j=i;j< code_arr.length; j++){
          if(code_arr[j] != '1'){
            if (j % 2 == 0) {
              ret += code_arr[j];
            }
          }else{
            mode = 1;
            i=j;
            break;
          }
          if(j==code_arr.length-1){
            i=j;
            break;
          }
        }
        
      } else if (mode == 1) {
        for(int j=i;j< code_arr.length; j++){
          if(code_arr[j] != '1'){
            if (j % 2 == 1) {
              ret += code_arr[j];
            }
          }else{
            mode = 0;
            i=j;
            break;
          }
          if(j==code_arr.length-1){
            i=j;
            break;
          }
        }
      }
    }
    if (ret == null || ret.equals("")) {
      answer = "EMPTY";
    } else {
      answer = ret;
    }
        return answer;
    }
}