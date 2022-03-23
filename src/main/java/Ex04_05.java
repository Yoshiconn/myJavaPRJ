public class Ex04_05 {
    public static void main(String[] args) {
        int a = 100, b = 200;

        // 관계연산자 return 타입은 boolean 이다.
        System.out.printf("%d == %d 는 %s 이다.\n", a, b, a == b);
        System.out.printf("%d != %d 는 %s 이다.\n", a, b, a != b);
        System.out.printf("%d > %d 는 %s 이다.\n", a, b, a > b);
        System.out.printf("%d < %d 는 %s 이다.\n", a, b, a < b);
        System.out.printf("%d >= %d 는 %s 이다.\n", a, b, a >= b);
        System.out.printf("%d <= %d 는 %s 이다.\n", a, b, a <= b);

        System.out.printf("%d = %d 는 %s 이다.\n", a, b, a = b);
    }
}
