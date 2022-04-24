import java.util.Scanner;

public class ex04_25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        for (int i = 1; i <= n * 2; i++) {

            if (i <= n) {
                for (int j = 1; j <= i; j++) {
                    System.out.printf("*");
                }
                System.out.printf("\n");
            } else {
                for (int k = i; k < n * 2; k++) {
                    System.out.printf("*");
                }
                System.out.printf("\n");
            }
        }
    }
}