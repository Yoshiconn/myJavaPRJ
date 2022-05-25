public class A002 {

    public static void main(String[] args) {
        int i = 1, j = 10;

        int k = sum(i, j);
        System.out.println("k : " + k);

        int m = sum(10, 11);
        System.out.println("m : " + m);

    }

    public static int sum(int i1, int i2) { // 메소드 구조 무조건 외워야함

        int sum = 0;
        int hap = 0;

        for (int i = i1; i <= i2; i++) {
            sum += 1;
            hap *= sum;
        }
        return hap;
    }
}

