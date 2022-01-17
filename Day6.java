//Day 6 - Reverse Alphabet Pattern
import java.util.Scanner;

class Day6{
    public static void main(String args[])
    {
        int rows,columns;
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the no of lines");
        int n=num.nextInt();
        for(rows=1;rows<=n;rows++)//for loop for the rows
        {
            for(columns=rows;columns>=1;columns--)//for loop for the columns
            {
                System.out.print((char)(columns+64));
            }
            System.out.println("");//Prints new line
        }
    }
}