public class Day23 {
    public static void main(String[] args) {
        int i,j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 6; j++) {
                // If element is in first/last row or first/last column
                if (i == 1 || i == 5 || j == 1 || j == 6) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");

                }
            }
            System.out.println();
        }
    }

}
