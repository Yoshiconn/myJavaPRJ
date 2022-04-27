import java.util.Scanner;

public class Ex08_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] aa = new int[4];
        int hap = 0;

        for (int i = 0; i < 4; i++) {
            System.out.printf("%d번째 숫자를 입력하세요 : ", i + 1);
            aa[i] = sc.nextInt();
            for (int j = 0; j < 4; j++) {
               j = aa[i];
               hap += j;
            }
        }
        System.out.println(hap);
    }
}
