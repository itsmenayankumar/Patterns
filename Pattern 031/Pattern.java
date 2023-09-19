import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 1; i <= n; i++) {
            int val = n;
            for(int j = 1; j <= n; j++) {
                if(j+i==n+1) {
                    System.out.print("* ");
                    val--;
                }else {
                    System.out.print(val+" ");
                    val--;
                }
            }
            System.out.println();
        }
    }
}