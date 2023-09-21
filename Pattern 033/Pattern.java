import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            int count = n-i+1;
            for(int j = 1;  j <= i-1; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.print(0+" ");
            int count2 = n-1;
            for(int j = 1; j <= i-1; j++) {
                System.out.print(count2+" ");
                count2--;
            }
            System.out.println();
        }
    }
}