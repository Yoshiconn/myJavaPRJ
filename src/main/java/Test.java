import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j;
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (i = 1; i <= a; i++) {
            for (j = 1; j <= b; j++) {
                for (j = 1; j <= b; j++) {
                    System.out.printf("%d %d \n", i, j);
                }
            }

        }

    }
}

