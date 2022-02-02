public class Day22 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }

            for (int j= i*2 ; j < 5*2; j++)
            {
                System.out.print(" ");
            }
            for (int l = i; l >= 1; l--)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
