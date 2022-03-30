public class Ex05_02 {
    public static void main(String[] args) {
        int a = 200;

        if (a < 100) // 범위{} 를 지정을 안해주면 밑에줄 까지 출력을 한다
            System.out.printf("100보다 작군요..\n"); // 거짓 이므로 출력을 안한다
            System.out.printf("거짓이므로 이 문장은 안보이겠죠?\n"); // 단 if를 범위를 지정을 안해줘서 일반 printf 로 인식해서 출력

        System.out.printf("프로그램 끝! \n");
    }
}
/*
        int a = 200;

        if (a < 100) { // 범위{} 를 지정을 해주었으니 프로그램 끝! 만실행
            System.out.printf("100보다 작군요..\n"); // 거짓 이므로 출력을 안한다
            System.out.printf("거짓이므로 이 문장은 안보이겠죠?\n"); // 거짓 이므로 출력을 안한다
        }
        System.out.printf("프로그램 끝! \n");
 */