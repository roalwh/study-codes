import java.math.BigInteger; //long 초과;
class Solution {
    public String solution(String a, String b) {
        BigInteger tmp1 = new BigInteger(a);
        BigInteger tmp2 = new BigInteger(b);
        BigInteger tmp3 = new BigInteger("0");
        tmp3 = tmp3.add(tmp1);
        tmp3 = tmp3.add(tmp2);
        
        String answer = String.valueOf(tmp3);
        return answer;
    }
}