import java.util.Scanner;

//Day 3 - Diamond Shape Star Pattern
public class Day3 {
    public static void main(String[] args){
        System.out.println("enter no of lines");
        Scanner lines = new Scanner(System.in);
        int n = lines.nextInt();
        pattern2(n);
    }

    public static void pattern2(int n){
        for(int i = 1;i<=n ; i++){
            for(int j = 1; j<=n-i+1 ; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}


