public class Ex04_04 {
    public static void main(String[] args) {
        int a = 10, b;

        b = a++; // b = 10 a = 11 b에 a을 대입한 후 a를 1 증가시킴  (후위 연산)
        System.out.printf("%d \n", b);

        b = ++a; // a = 12 b = 12 a를 먼저 1 증가시킨후 b에 a값을 대입시킴 (전위 연산)
        System.out.printf("%d \n", a);
    }
}
