//Day 10 - Hour glass pattern using stars
import java.util.*;

public class Day10 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Enter Number of lines");
        int lines = l.nextInt();
        for (int i = lines; i>=1; i--) //To print the upper part
        {
            System.out.println();
            for (int j = 0; j <i; j++) {
                System.out.print("*");
            }

        }
        for (int i = 0; i <=lines; i++) //To print lower part
        {
                for (int j =0; j <i; j++) {
                    System.out.print("*");
                }
            System.out.println();
        }

    }
}
