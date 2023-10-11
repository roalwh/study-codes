class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int[] a_num_list = new int[num_list.length+1];

        if(num_list[num_list.length-1]>num_list[num_list.length-2]){
            for(int i=0;i<num_list.length;i++){
                a_num_list[i] = num_list[i];
            }
            a_num_list[num_list.length] = num_list[num_list.length-1] - num_list[num_list.length-2];
        }else{
            for(int i=0;i<num_list.length;i++){
                a_num_list[i] = num_list[i];
            }
            a_num_list[num_list.length] = num_list[num_list.length-1]*2;
        }
        answer=a_num_list;

        return answer;
    }
}