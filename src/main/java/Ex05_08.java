import java.util.Scanner;

public class Ex05_08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // 내가 키보드 에서 입력한 값을 메모리에 올려라 라는 뜻이다.
        int a;

        System.out.printf("점수를 입력하세요");
        a = sc.nextInt();

        if (a >= 90) {
            System.out.printf("A");

        } else {
            if (a >= 80) {
                System.out.printf("B");

            } else {
                if (a >= 70) {
                    System.out.printf("C");

                } else {
                    if (a >= 60) {
                        System.out.printf("D");

                    } else {
                        System.out.println("F");
                    }
                    System.out.printf(" 학점 입니다. \n");
                }
            }
        }
    }
}
