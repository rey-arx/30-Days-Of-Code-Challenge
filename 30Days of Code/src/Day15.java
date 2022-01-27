import java.util.*;
public class Day15 {
    public static void main(String[] args) {
 
        Scanner in=new Scanner(System.in);
        System.out.println("enter the no.of lines: ");
        int n=in.nextInt();
        for (int i=1; i<= n ; i++)
        {
            for (int j = i; j < n ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i -1) ;k++) {
                if( k==1 || i == n || k==(2*i-1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
}
