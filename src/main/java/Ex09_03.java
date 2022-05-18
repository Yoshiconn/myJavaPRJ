import java.util.Scanner;

public class Ex09_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str;

        System.out.print("문자열 입력 ==> ");
        str = sc.nextLine();
        sc.close();

        System.out.print("출력 문자열 ==>");

        if(!str.startsWith("(")) { // !부정 연산자 str.startsWith <- 문자의 시작이 ( 가 아니라면
            System.out.print("("); // ( 출력
        }

        for (int i = 0; i < str.length(); i++) {
            System.out.printf("%c", str.charAt(i));
        }



        if(!str.endsWith(")")) { // ! 부정 연산자 str.endWith <- 문자의 끝이 ) 가 아니라면
            System.out.print(")"); // ) 출력
        }

    }
}
