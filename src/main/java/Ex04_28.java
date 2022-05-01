import java.util.Scanner;

public class Ex04_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] aa = new int[4];
        int hap = 0;
        int result = 0;

        for (int i = 0; i < 4; i++) {
            System.out.printf("%d번째 숫자를 입력하세요 : ", i + 1);
            aa[i] = sc.nextInt();
            for (int j = 1; j < 10; j++) {
                hap = aa[i] * j;
                System.out.printf("%d * %d = %d / ",aa[i],j,hap);
                if (j != 10){
                    result += hap;
                }
            }
            System.out.println();
        }
        System.out.println("모든 곱의 합은: "+ result +" 입니다.");
    }
}

