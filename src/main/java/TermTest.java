import java.util.Scanner;

public class TermTest {


    public static void main(String[] args) {

        //Q.1 내가 입력한 숫자가 홀인지? 짝인지? 출력해주는 프로그램
        // 10 -> 짝. /11 -> 홀입니다.

        Scanner sc = new Scanner(System.in);
        int a;

        a = sc.nextInt();

        if(a%2==0)
        {
            System.out.println("짝 입니다.");
        }
        else
        System.out.println("홀 입니다.");
    }
}
