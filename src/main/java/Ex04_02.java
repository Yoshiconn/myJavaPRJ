public class Ex04_02 {
    public static void main(String[] args) {
        int a = 2, b = 3, c =4;
        int result1, mok, namugi;
        float result2;

        result1 = a + b - c;
        System.out.printf("%d + %d - %d = %d \n", a, b, c, result1);

        result1 = a + b * c;
        System.out.printf("%d + %d * %d = %d \n", a, b, c, result1); // 연산자 우선 순위 법칙에 따라서 *먼저 계산한뒤 a를 더했다.

        result2 = a * b / (float) c; // c를 강제로 형 변환 int -> float 형으로 (4 -> 0.4) 계산 할때로 실수가 들어가면 모든 연산이 실수형으로 계산이 된다.
        System.out.printf(" %d * %d / %d = %f \n", a, b, c, result2);

        mok = c / b;
        System.out.printf(" %d / %d 의 몪은 %d \n", c, b, mok);

        namugi = c % b;
        System.out.printf(" %d / %d 의 나머지는 %d \n", c, b, namugi);
    }
}
