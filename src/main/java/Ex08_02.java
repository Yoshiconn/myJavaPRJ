import java.util.Scanner;

public class Ex08_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] aa = new int[4];
        int hap = 0;

        System.out.print("1번째 숫자를 입력해하세요. : ");
        aa[0] = sc.nextInt();
        System.out.print("2번째 숫자를 입력해하세요. : ");
        aa[1] = sc.nextInt();
        System.out.print("3번째 숫자를 입력해하세요. : ");
        aa[2] = sc.nextInt();
        System.out.print("4번째 숫자를 입력해하세요. : ");
        aa[3] = sc.nextInt();

        hap = aa[0] + aa[1] + aa[2] + aa[3];

        System.out.printf(" 합계 ==> %d \n", hap);

        for (int i = 0; i < 4; i++) // 배열은 0부터 시작 {
            System.out.println("aa[" + i + "] = " + aa[i]);
    }
}

