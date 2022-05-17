import java.util.Scanner;

public class butterfly1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < 2 * n; j++) {
                if ((j < (0 + i) && j >= 0) || (j >= (2 * n - i) && j <= 2 * n)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
