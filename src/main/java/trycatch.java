import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class trycatch {
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

        } finally { // 메모리를 회수 해주는 로직임 필수는 아니나 무조건 사용하는 버릇을 들이자!
            System.out.println("이 부분은 에러 여부에 상관없이 무조건 실행됨!");
        }
    }
    public static String ch2() {
        int a = 100, b = 0;
        String err = null;
        int result;

        try {
            if (b == 0)
                throw new Exception("0으로 나눌수 없?음!"); // 에러를 던진다 어디로? catch 로
            result = a / b;
        } catch (Exception e) { // Exception 에 사용자가 입력해놓은 메시지를 e에 넣음
            err = e.getMessage();
            System.out.println("발생 오류 ==> " + e.getMessage());

            System.out.println("에러 메시지 : " + e);
        }
        return err;

    }
    public void fisinput(String[] args) throws Exception { // 문단 전체에 오류 체크를 할때는 여기에 throws 를 사용

        FileInputStream fis = new FileInputStream("/test/data1.txt"); // 디폴트 경로가 c 드라이브라 생략 해도됨 왠만하면 이렇게 쓸것
        // 왜냐면 우분투나 이런거는 경로가 c로 시작하지 않기 때문에 그럼.
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8); // fis 파일을 다시 읽어서 표준셋인 UTF-8로 스트림을 변경시켜버림
        // 한국어를 표현할수 있는 인코딩 방식이 있음 euc-kr && UTF-8
        // UTF-8은 엄밀히 말하자면 한국어만을 위한 인코딩 방식이 아님 한국어 일본어 등등 을 통합해놓은 인코딩셋임 보통 UTF-8을 사용
        // euc-kr 은 왜 사용을 안하냐면 사람들이 사전에 없는 이상한 단어들을 만들어 써서 몰?루 가 되버렸기 때문에 UTF-8을 사용한다.

        int ch; // 글자를 한글자 씩 읽기 위해서 변수 선언
        while ( (ch = isr.read()) != -1) { // Stream 이라는 객체는 파일을 끝까지 읽으면 -1을 리턴함
//        while ( (ch = fis.read()) != -1) {
            System.out.print((char) ch); // 문자는 아스키코드 값으로 읽어지는데 형변환을 해서 아스키코드 값이 아닌 문자가 출력됨.
        }
        fis.close();
    }
}


