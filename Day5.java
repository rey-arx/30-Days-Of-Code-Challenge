//Day-5 pattern - Right Side triangle number Pattern

import java.util.Scanner;

public class Day5 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter Number of lines");
        int n = num.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j =1; j <=(n-i+1); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
