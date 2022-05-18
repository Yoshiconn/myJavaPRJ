import java.util.Scanner;

public class Ex09_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str, strRep, strSub, strAry[];

        System.out.print("문자열을 입력하세요 : ");
        str = sc.nextLine();
        sc.close();

        strRep = str.replace(" ", "$");
        strSub = str.substring(3,8);
        strAry = str.split(" ");

        System.out.println("입력 문자열 ==> " + str);
        System.out.println("바꾼 문자열 ==> " + strRep);
        System.out.println("일부 문자열 ==> " + strSub);

        for(int i = 0; i < strAry.length; i++) {
            System.out.println("분리한 문자열" + i + "==>" + strAry[i]);
        }

        // Access_log 서버 로그 샘플
        String log = "123.123.123.123 - - [12/Apr/2018:17:03:50 +0900] \"GET /api/aaaa HTTP/1.1\" 200 34 1468 \"https://m.naver.com\" \"Mozilla/5.0 (iPhone; CPU iPhone OS 11_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E216 NAVER(inapp; search; 580; 8.6.3; 7)";

        String[] item = log.split(" ");

        for(int i = 0; i < 5; i++) {
            System.out.println("item[" + i + "] : " + item[i]);
        }

        String time = item[3];

        System.out.println("time : " + time.substring(1, time.length()));

    }
}
