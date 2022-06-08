public class Ex10_04 {
    public static void main(String[] args) {

        int a = 100, b = 0;
        int result;

        try {
            if (b == 0)
                throw new Exception("0으로 나눌수 없?음!"); // 에러를 던진다 어디로? catch 로
                result = a / b;
        } catch (Exception e) { // Exception 에 사용자가 입력해놓은 메시지를 e에 넣음
            System.out.println("발생 오류 ==> " + e.getMessage());
            System.out.println("에러 메시지 : " + e);
        }
    }
}
