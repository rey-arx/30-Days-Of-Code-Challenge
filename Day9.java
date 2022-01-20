import java.util.Scanner;

//Day 9 - Zeros/Ones pattern
public class Day9 {

    public static void main(String[] args) {
        System.out.println("enter no of lines");
        Scanner lines = new Scanner(System.in);
        int n = lines.nextInt();
        day9(n);
       }

        public static void day9(int n) {
            for(int i = 1;i<=n ; i++){
                for (int k = 1; k <=i ; k++) {
                    if (k%2==0)
                        System.out.print("0");
                    else
                        System.out.print("1");
                }
                System.out.println();
            }
    }


    }
