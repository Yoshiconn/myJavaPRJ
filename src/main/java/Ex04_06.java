public class Ex04_06 {
    public static void main(String[] args) {
        int a = 99;

        System.out.printf(" AND 연산 : %S \n", (a >= 100) && (a <= 200)); //연산자 우선 법칙 때문에 조건에 괄호를 입력해 주자.
        System.out.printf(" OR 연산 : %S \n", (a >= 100) || (a <= 200));
        System.out.printf(" NOT 연산 : %S \n", !(a == 100));
    }
}
