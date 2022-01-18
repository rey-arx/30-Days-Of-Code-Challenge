import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the no of lines");
        int rows =num.nextInt();
        int i, j;
        for (i = rows; i >= 1; i--)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print(j+" ");//To print upper half
            }
            System.out.println();
        }
        for (i = 2; i <= rows; i++)//To Print lower half  pattern
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
