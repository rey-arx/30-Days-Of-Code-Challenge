import java.util.*;
//Day16 - Binary Number Pattern
public class Day16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the no.of lines: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            int num;
            if (i % 2 == 0) {
                num = 0;
                for (int j = 1; j <= n; j++) {
                    System.out.print(num);

                    num = (num == 0) ? 1 : 0;

                }
            } else {
                num = 1;

                for (int j = 1; j <= n; j++) {
                    System.out.print(num);

                    num = (num == 0) ? 1 : 0;
                }
            }

            System.out.println();
        }
    }
}
