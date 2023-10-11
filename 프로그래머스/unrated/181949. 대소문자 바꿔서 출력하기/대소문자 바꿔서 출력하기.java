import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String res ="";
        for(char x : a.toCharArray()){
            
            if(Character.isLowerCase(x)) {
                res += Character.toUpperCase(x);
                }else{
                res += Character.toLowerCase(x);
                }
    }
        System.out.print(res);
}
    }