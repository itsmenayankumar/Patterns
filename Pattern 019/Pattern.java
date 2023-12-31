import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star = n/2+1;
        int space = -1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= star; j++) {
                System.out.print("* ");
            }
            for(int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= star; j++) {
                if(i==1 && j==star) {
                    continue;
                }
                if(i==n && j==star) {
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
            if(i<=n/2) {
                star--;
                space+=2;
            }else {
                star++;
                space-=2;
            }
        }
    }
}
