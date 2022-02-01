public class Day21 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--)
        {
            for (int j = 5; j >= 1+5-i; j--)
            {
                System.out.print(j);
            }

            for (int j= i*2 ; j < 5*2-1; j++)
            {
                System.out.print(" ");
            }

            for (int l = 1+5-i; l <=5; l++)
            {
                if(l!=1)
                    System.out.print(l);
            }
            System.out.println();
        }
    }
}
