import java.util.Scanner;

public class TermTest1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;
        a = sc.nextInt();

      //if ((a % 3 == 15)) <-- 최소 공배수 로 구할수 있다. 밑에 보면 컴퓨터가 총 3번 계산하지만, 최소 공배수로 구하면 컴퓨터가 1번만 계산하게 된다.
        if ((a % 3 == 0) && (a % 5 == 0)) { // 연산자 우선순위 때문에 괄호 쳐주기
            System.out.println("3과 5의 배수를 둘다 만족합니다.");

        } else if (a % 3 == 0) {
            System.out.println("3의 배수입니다.");

        } else if (a % 5 == 0) {
            System.out.println("5의 배수입니다.");

        }
    }
}
