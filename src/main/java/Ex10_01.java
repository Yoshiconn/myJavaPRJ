public class Ex10_01 {
    public static void main(String[] args) {
        int[] aa = new int[3];

        try {
            aa[3] = 100;

        } catch (ArrayIndexOutOfBoundsException e) { // e는 변수명이다. 보통 e(exception) 약어로 많이쓴다함
            System.out.println("배열 첨자가 배열 크기보다 커요!");
            System.out.println("에러 메시지 : " + e);
        }
    }
}
