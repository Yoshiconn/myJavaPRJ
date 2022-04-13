public class Ex07_01 {
    public static void main(String[] args) {
        int i = 1;
        int hap = 0;

        while (i < 11) {
            hap +=i;
            i++;  // 조건 값에 변화를 주어야함 아니면 무한루프돔 증감이던 증가이던
        }
        System.out.printf(" 1에서 10까지의 합: %d \n", hap);
    }
}
