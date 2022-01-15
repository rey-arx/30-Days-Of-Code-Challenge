import java.util.Scanner;

public class Day4 {
    public static void main(String[] args){
        System.out.println("enter no of lines");
        Scanner lines = new Scanner(System.in);
        int n = lines.nextInt();
        day4(n);
    }
    public static void day4(int n){
        for (int row = 1; row <= (2*n)-1 ; row++){
            if(row > n){
                for (int col = 0; col < ((2*n)-row) ; col++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
            for (int column = 1; column <=row ; column++) {
                System.out.print("*");
            }
                System.out.println();
            }

        }
    }
}
