import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int num = 1;
        int space = n-1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            int count = 1;
            for(int j = 1; j <= num; j++) {
                System.out.print(count+" ");
                if(j<=num/2) {
                    count++;
                }else {
                    count--;
                }
            }
            System.out.println();
            num+=2;
            space--;
        }
    }
}