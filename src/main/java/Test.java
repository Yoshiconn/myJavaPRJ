import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int i, j;

        for (i = 0; i < a; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (i = 1; i < a - 1; i++) {
            for (j = 0; j < a; j++)

                if (j == 0 || j==i || j==a-1-i || j == a-1 || a/2 == i || a/2 == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            System.out.println();
        }
        for (i = 0; i < a; i++) {
            System.out.print("*");
        }
    }
}

