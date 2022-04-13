import java.util.Scanner;

public class Ex06_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int dan;

        System.out.print("몇단을 출력 할꺼?: ");
        dan = sc.nextInt();

        for(i = 1; i < 10; i++) {
            System.out.printf(" %d * %d = %d  \n", dan, i, dan*i);
            // System.out.println(dan + " * " + i + " = " + dan * i);
        }
    }
}
