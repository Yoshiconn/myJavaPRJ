import java.util.Scanner;

public class Ex00_00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.printf("1 ~ 4 중에 선택하세요 :  ");
        a = sc.nextInt();

        if (a == 1) {
            System.out.println("1을 선택했다.");
        } else if (a == 2) {
            System.out.println("2를 선택했다.");
        } else if (a == 3) {
            System.out.println("3을 선택했다.");
        } else if (a == 4) {
            System.out.println("4를 선택했다.");
        } else {
            System.out.println("이상하게 선택했다.");
        }
    }
}
