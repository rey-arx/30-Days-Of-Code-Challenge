public class Day25 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                if (i == (5 / 2) || j == (5 / 2))
                {
                    System.out.print("0" + " ") ;
                    continue;
                }
                System.out.print("1" + " ");
            }
            System.out.println();
        }
    }
}
