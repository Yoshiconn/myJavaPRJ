import java.util.Scanner;

public class Note_0526 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int in = sc.nextInt();

        System.out.println(fibonacci(in));

    }

    public static int fibonacci(int in) {

        if (in == 0) {
            return 0;
        }
        if (in == 1) {
            return 1;
        }

        return fibonacci(in - 1) + fibonacci(in - 2);
    }
}