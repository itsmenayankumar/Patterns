import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 1; i <= n; i++) {
            int pos = 1;
            for(int j = 1; j <= i+i-1; j++) {
                if(pos%2 != 0) {
                    System.out.print(i+" ");
                }else{
                    System.out.print("* ");
                }
                pos++;
            }
            System.out.println();
        }
        for(int i = n-1; i >= 1; i--) {
            int pos = 1;
            for(int j = 1; j <= i+i-1; j++) {
                if(pos%2 != 0) {
                    System.out.print(i+" ");
                }else {
                    System.out.print("* ");
                }
                pos++;
            }
            System.out.println();
        }
    }
}