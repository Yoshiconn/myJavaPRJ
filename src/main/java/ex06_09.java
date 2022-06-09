public class ex06_09 {
    public static void main(String[] args) {

        String log = "111.222.33.44 - - [11/Jun/2012:22:12:32 +0900] \"GET /w/custom/jmnote20120124.ico HTTP/1.1\" 304 - \"-\" \"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; MS-RTC LM 8)\"";

        String[] item = log.split(" ");

        System.out.println("ip : " + item[0]);

        String time = item[3].substring(1);

        System.out.println("time : " + time);

        // 함수를 생성할 때, 결과 값을 반환하지 않을 경우 사용되는 반환타입은 void 이다.

    }

    public static int sum(int num1, int num2) {

        num1 += num2;

        return num1;

    }
}

