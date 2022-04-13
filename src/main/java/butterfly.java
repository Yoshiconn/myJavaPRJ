import java.util.Scanner;

public class butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int j;
        a = sc.nextInt();
        int n = 0;

        for(int i = 1; i<=(a*2)-1; i++) {

            if (i <= a) {
                n++;
            } else {
                n--;
            }
            for(j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}