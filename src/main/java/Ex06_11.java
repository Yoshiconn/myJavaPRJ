import java.util.Scanner;

public class Ex06_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hap = 0;
        int num1, num2, num3;

        // 시작값이 끝보다 큰 수가 들어오면, "시작값이 끝수보다 큽니다." 출력하기

        System.out.printf(" 시작값 입력 : ");
        num1 = sc.nextInt();
        System.out.printf(" 끝값 입력 : ");
        num2 = sc.nextInt();
        System.out.printf(" 증가값 입력 : ");
        num3 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("시작값이 끝수보다 큽니다.");
        } else {
            for (int i = num1; i <= num2; i += num3)
                hap += i;
            System.out.printf(" %d에서 %d까지 %d씩 증가한 값의 합: %d \n", num1, num2, num3, hap);
        }
    }
}
