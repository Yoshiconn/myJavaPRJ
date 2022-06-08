public class Ex10_02 {
    public static void main(String[] args) {
        int[] aa = new int[3];
        try {
            aa[2] = 100 / 0;
            aa[3] = 100;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 첨자가 배열 크기보다 커요!");
            System.out.println("에러 메시지 : " + e);

        } catch (ArithmeticException e) {
            System.out.println("0으로 나누는 등의 오류에요!");
            System.out.println("에러 메시지 : " + e);

        } catch (Exception e) { // 중요함
            /* catch 순서대로 실행하는데, 모든에러를 잡는 Exception 은 항상 마지막에 있어야함
             예상치 못한 오류를 잡을수 있음 */
            System.out.println("모든 에러를 잡음");
            System.out.println("에러 메시지 : " + e);

        } finally {
            System.out.println("이 부분은 에러 여부에 상관없이 무조건 실행됨!");
        }
    }
}
