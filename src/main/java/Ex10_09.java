import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Ex10_09 {
    public static void main(String[] args) throws Exception { // 문단 전체에 오류 체크를 할때는 여기에 throws 를 사용

        FileInputStream fis = new FileInputStream("/test/data1.txt"); // 디폴트가 c 드라이브라 생략 해도됨 왠만하면 이렇게 쓸것
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
