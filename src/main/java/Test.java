import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int gub = 0;

        System.out.printf("몇단을 출력 할까요? : ");
        n = sc.nextInt();
        sc.close();

        for(int i = n; i <= n; i++){
            for (int j = 1; j < 10; j++) {
                gub = i * j;
                System.out.printf("%d * %d = %d \n",i, j,gub);
            }
            System.out.printf("-----------");
        }
    }
}