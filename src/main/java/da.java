import java.util.Scanner;

public class da {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int hap = 0;
        int result = 0;
        int i = 1;
        while (i < 10) {
            hap = a * i;
            System.out.printf("%d * %d = %d \n", a, i, hap);
            i++;
            result += hap;
        }
        System.out.printf("%d단 의 모든 곱의 합은 %d 입니다.", i,result);
    }
}